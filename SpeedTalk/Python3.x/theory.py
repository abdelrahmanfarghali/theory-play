import time as tie
start = tie.time()
print('I handed the two handed swords to the handsmen')
if input() == 'swords':
    end = tie.time()
    if end - start > 900:
        print('timeout')
    else:
        print(end - start)
else:
    print('lost')
start = tie.time()
print('I two handed the handsmen to the handed spirit')
if input() == 'spirit':
    end = tie.time()
    if end - start > 900:
        print('timeout')
    else:
        print(end - start)
else:
    print('lost')
start = tie.time()
print('handsmen handed two handed shotguns to I')
if input() == 'shotguns':
    end = tie.time()
    if end - start > 900:
        print('timeout')
    else:
        print(end - start)
else:
    print('lost')
start = tie.time()
print('Handed two handsmen to the two handed agent')
if input() == 'agent':
    end = tie.time()
    if end - start > 900:
        print('timeout')
    else:
        print(end - start)
else:
    print('lost')
start = tie.time()
print('handsmen handed two handed ancient toothbrushs')
if input() == 'ancient toothbrushs':
    end = tie.time()
    if end - start > 900:
        print('timeout')
    else:
        print(end - start)
else:
    print('lost')
