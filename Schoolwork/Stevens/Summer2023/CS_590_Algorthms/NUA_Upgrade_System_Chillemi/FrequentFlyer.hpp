#pragma once

#include <iostream>
#include <string>

using namespace std;

namespace NewUnknownAirlineUpgradeSystem 
{
    class FrequentFlyer
    {
        public:
        
            enum FrequentFlyerStatus{
                INVALID=-1,
                SILVER=0,
                GOLD=1,
                PLATINUM=2,
                SUPER=3
            };
    
            int confirmation_number;
    
            int wait_time;
    
            FrequentFlyerStatus current_status;
    
            FrequentFlyer(int confirmation_num, FrequentFlyerStatus current_stat, int waitTime)
            {
                /*cout << "FF CCon" << endl;*/
                confirmation_number = confirmation_num;
                current_status = current_stat;
                wait_time = waitTime;
            }
    
            FrequentFlyer()
            {}
    
            ~FrequentFlyer(){/*cout << "FF DCon" << endl;*/}
    
            bool operator==(FrequentFlyer frequent_flyer);
    
            bool operator>(FrequentFlyer frequent_flyer);
    
            bool operator<(FrequentFlyer frequent_flyer);
    
            bool operator>=(FrequentFlyer frequent_flyer);
    
            bool operator<=(FrequentFlyer frequent_flyer);
    
            string toString();
    
    };
}
