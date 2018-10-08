#basketballTest.py
from unittest import TestCase, mock
from basketball import Basketball
from exercise import fits
 
 
class Evaluate(TestCase):
 
    def test_get_box_volume(self):
        ball = Basketball(1)
        self.assertEqual(8, ball.get_box_volume(), 
            "get_box_volume() fails if radius is 1")
 
    @mock.patch.object(Basketball, 'get_box_volume')
    def test_fits_isolated(self, volume_mock):
        volume_mock.return_value = 10
        # get_box_volume is mocked so radius doesn't matter anymore
        self.assertFalse(fits([Basketball(1), Basketball(1), Basketball(1)], 25),
            "Doesn't work if volume is 10")
        # We made sure user calls get_box_volume and doesn't calculate volume in fits_or_not function
        self.assertEqual(volume_mock.call_count, 3, "Are you calling get_box_volume()")
        
    def test_fits(self):
        self.assertTrue(fits([Basketball(1), Basketball(1), Basketball(1)], 25),
            "Doesn't work if there are 3 balls with radius=1")
            
        self.assertFalse(fits([Basketball(2), Basketball(5)], 1000),
            "Doesn't work if there are 2 balls with radius=2 and radius=5")
            
        self.assertTrue(fits([Basketball(5)], 1000),
            "Doesn't work if there is 1 ball with radius=5")