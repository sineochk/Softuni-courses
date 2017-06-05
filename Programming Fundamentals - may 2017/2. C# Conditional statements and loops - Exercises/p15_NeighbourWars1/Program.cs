using System;

// change from testBranch
namespace p15_NeighbourWars1
{
    class Program
    {
        static void Main(string[] args)
        {
            int pDmg = int.Parse(Console.ReadLine());
            int gDmg = int.Parse(Console.ReadLine());
            bool pAttacks;

            for(int gHp = 100, pHp = 100, round = 1; gHp>0 && pHp>0; round++)
            {
                pAttacks = round % 2 == 1;
                if (pAttacks)
                {
                    //pesho attacks gosho
                    gHp -= pDmg;
                } else
                {
                    // gosho attacks pesho
                    pHp -= gDmg;
                }
                if(gHp<=0 || pHp<=0)
                {
                    Console.WriteLine("{0} won in {1}th round.", (gHp<=0?"Pesho":"Gosho"), round );
                } else
                {
                    Console.WriteLine("{0} used {1} and reduced {2} to {3} health.",
                                        pAttacks ? "Pesho" : "Gosho",
                                        pAttacks ? "Roundhouse kick" : "Thunderous fist",
                                        pAttacks ? "Gosho" : "Pesho",
                                        pAttacks ? gHp : pHp
                        );
                    if (round % 3 == 0)
                    {
                        gHp += 10;
                        pHp += 10;
                    }
                }
            }
        }
    }
}
