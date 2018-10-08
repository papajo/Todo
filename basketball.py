#basketball.py

class Basketball:
    
    def __init__(self, radius):
        self.radius = radius
    
    def get_box_volume(self):
        side = self.radius * 2
        return side * side * side
