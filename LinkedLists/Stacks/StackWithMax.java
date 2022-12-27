package LinkedLists.Stacks;

/*
 * This class has every operation a stack has with the normal runtimes, with additional max function.
 * the supported operations are:
 * push(x)
 * pop()
 * max()
 * Every operation with a time complexity of O(1)
 * 
 * In order to actually reach the maximum element within O(1), I will use another stack to record the "Max" history,
 * so that even if we pop the current maximum element, we will update the maximum element to be the 2nd largest maximum.
 */
public class StackWithMax {
    private Stack _nums;
    private Stack _maxes;

    public StackWithMax()
    {
        _nums = new Stack();
        _maxes = new Stack();
    }

    public void push(int x)
    {
        _nums.push(x);
        // If maxes is empty that means this is the first element we push, so we add it to the maximum stack
        // since it is technically the maximum (and only) element
        if(_maxes.isEmpty())
        {
            _maxes.push(x);
        }
        else
        {
            // If the value we are adding to the stack is larger than the current maximum, we add it also to the maxes
            // stack.
            if (_maxes.peek() < x)
            {
                _maxes.push(x);
            }
        }
    }

    public int pop()
    {
        if (_nums.isEmpty())
        {
            return -1;
        }

        int x = _nums.pop();
        // If the element we are popping is the current maximum, we must update the maxes stack.
        if (x == _maxes.peek())
        {
            _maxes.pop();
        }
        return x;
    }

    public int max()
    {
        if (!_nums.isEmpty())
        {
            return _maxes.peek();
        }
        return -1;
    }
}
