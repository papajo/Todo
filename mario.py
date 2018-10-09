#Can Mario Save the princess from the monster?
import math
 
 
def can_save(mario_x, mario_y, monster_x, monster_y):
    mario_distance = math.sqrt(mario_x * mario_x + mario_y * mario_y)
    monster_distance = math.sqrt(monster_x * monster_x + monster_y * monster_y)
    return mario_distance < (monster_distance / 3)
    