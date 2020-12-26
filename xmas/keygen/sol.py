from pwn import *
import angr
import claripy
import string
#p = process("./KeygenToTheKindom")
#pid = gdb.attach(p,gdbscript="")
#p.interactive()

proj = angr.Project(
	'KeygenToTheKindom',
)

flag_len = 25

flag = claripy.BVS("flag",8*flag_len)


state = proj.factory.entry_state(stdin=angr.SimFileStream(name='stdin', content=flag, has_end=False))



want_addr = 0x1255
avoid_addr = 0x127e

for char in range(25):
	state.solver.add(flag.get_byte(char)>0x20)
	state.solver.add(flag.get_byte(char)<0x7f)
	print(chr((state.solver.eval(flag.get_byte(char)))))

sm = proj.factory.simulation_manager(state)
sm.explore(find = want_addr,avoid = avoid_addr)
#print('found: '+sm.found[0].posix.dumps(0).decode('utf-8'))