#Will the basketballs fit in the Truck
def fits(basketballs, truck_volume):
    total_volume = 0
    for ball in basketballs:
        total_volume += ball.get_box_volume()
        
    return total_volume <= truck_volume
