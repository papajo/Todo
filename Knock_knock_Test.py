import sys
from unittest import TestCase
from Todo import knockJoke
 
 
class Evaluate(TestCase):
 
    def test_knock_knock_example(self):
        knockJoke("Ya", "I'm excited to see you too!")
        output = sys.stdout.getvalue()
        self.assertEqual(
            "Knock! Knock!\nWho's there?\nYa.\nYa who?\nI'm excited to see you too!\n",
            output, "Wrong for the example input"
        )
        
    def test_knock_knock_robin(self):
        knockJoke("Robin", "Robin you! Hand over your cash!")
        output = sys.stdout.getvalue()
        self.assertEqual(
            "Knock! Knock!\nWho's there?\nRobin.\nRobin who?\nRobin you! Hand over your cash!\n",
            output, "Wrong for inputs 'Robin' and 'Robin you! Hand over your cash!'"
        )