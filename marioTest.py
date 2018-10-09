from unittest import TestCase
 
 
class Evaluate(TestCase):
 
    def test_can_save(self):
        import exercise
        self.assertFalse(exercise.can_save(0, 1, 3, 0), "Must be False for inputs: 0, 1, 3, 0")
        self.assertTrue(exercise.can_save(0, 1, 3, 1), "Must be True for inputs: 0, 1, 3, 1")
        self.assertTrue(exercise.can_save(1, 1, 3, 4), "Must be True for inputs: 1, 1, 3, 4")
        self.assertTrue(exercise.can_save(1, 1, 7, -4), "Must be True for inputs: 1, 1, 7, -4")
        self.assertFalse(exercise.can_save(3, 4, 3, 4), "Must be False for inputs: 3, 4, 3, 4")
        self.assertFalse(exercise.can_save(3, 4, 1, 2), "Must be False for inputs: 3, 4, 1, 2")
        self.assertFalse(exercise.can_save(10, 2, 8, 3), "Must be False for inputs: 10, 2, 8, 3")
        self.assertTrue(exercise.can_save(5, 10, 28, 30), "Must be True for inputs: 5, 10, 28, 13")
        self.assertTrue(exercise.can_save(-1, 1, 2, -7), "Must be True for inputs: -1, 1, 2, -7")