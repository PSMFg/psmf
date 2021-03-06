/*
    Trying to sinthesizing the add3 algorithim
    Java implementation:
    OutLoc = x + y + z;
*/
module progFinder

open ../imp[PreC, PosC]

--------------------------------------------------------------------------------
-- Specification predicate
--------------------------------------------------------------------------------

one sig InLoc1, InLoc2, InLoc3 extends XLoc {}
one sig OutLoc extends DLoc {}
one sig IState1 extends IState {} { bind = {InLoc1->1} + {InLoc2->3} + {InLoc3->4} + {OutLoc->0}}
one sig FState1 extends FState {} { bind = {InLoc1->1} + {InLoc2->3} + {InLoc3->4} + {OutLoc->8}}
one sig IState2 extends IState {} { bind = {InLoc1->4} + {InLoc2->1} + {InLoc3->2} + {OutLoc->0}}
one sig FState2 extends FState {} { bind = {InLoc1->4} + {InLoc2->1} + {InLoc3->2} + {OutLoc->7}}
one sig IState3 extends IState {} { bind = {InLoc1->3} + {InLoc2->1} + {InLoc3->5} + {OutLoc->0}}
one sig FState3 extends FState {} { bind = {InLoc1->3} + {InLoc2->1} + {InLoc3->5} + {OutLoc->9}}

one sig Example1 extends Example {} { pairs = IState1->FState1+IState2->FState2+IState3->FState3}

pred PreC[iSt: one IState] {

}

pred PosC[iSt: one IState, fSt: one FState] {

}

run Synt for 7 but -1..9 Int , 3 IState, 3 FState, 1 Assign, 4 SComp, 0 CondS, 0 While, 0 IntVal, 4 IntVar, 3 Add, 0 Sub, 0 Mult, 0 EQ, 0 NEQ, 0 LEQ, 0 GEQ, 0 GTH