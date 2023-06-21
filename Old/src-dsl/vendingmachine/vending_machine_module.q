User.select_coke --> User.getcoke == true
E<>  soft_drinks.coke == 0 and User.getcoke == 1
A[] (soft_drinks.coke > 0 and User.select_coke) imply User.getcoke == true
A[] not deadlock
