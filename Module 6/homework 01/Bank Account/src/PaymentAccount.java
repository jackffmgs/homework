public class PaymentAccount
{
    public int count;

    public PaymentAccount(int count)
    {
        this.count = count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
    public int getCount()
    {
        return count;
    }

    public int addCoin(int coin)
    {
        count = count + coin;
        return count;
    }

    public int subtractingCoin(int coin)
    {
        count = count - coin;
        return count;
    }
}
