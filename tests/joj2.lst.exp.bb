// Graph props:
//  addr: 20
//  name: 20
//  trailing_jumps: True

// Predecessors: []
00:
Exits: [(COND($a1 == 0), '20'), (None, '30')]

// Predecessors: ['00']
20:
$a2 = 1
Exits: [(None, '30')]

// Predecessors: ['00', '20']
30:
$a3 = 5
Exits: []
