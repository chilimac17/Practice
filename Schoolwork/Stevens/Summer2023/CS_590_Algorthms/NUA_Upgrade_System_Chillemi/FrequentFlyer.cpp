

#include <iostream>
#include <string>
#include "FrequentFlyer.hpp"

using namespace std;
namespace NewUnknownAirlineUpgradeSystem 
{
    bool FrequentFlyer::operator==(FrequentFlyer frequent_flyer)
    {
        if(this->confirmation_number == frequent_flyer.confirmation_number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    bool FrequentFlyer::operator>(FrequentFlyer frequent_flyer)
    {
        if(this->current_status > frequent_flyer.current_status)
        {
            return true;
        }
        else if(this->current_status < frequent_flyer.current_status)
        {
            return false;
        }
        else
        {
            if(this->wait_time > frequent_flyer.wait_time)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    bool FrequentFlyer::operator<(FrequentFlyer frequent_flyer)
    {
        if(this->current_status < frequent_flyer.current_status)
        {
            return true;
        }
        else if(this->current_status > frequent_flyer.current_status)
        {
            return false;
        }
        else
        {
            if(this->wait_time < frequent_flyer.wait_time)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    
    bool FrequentFlyer::operator>=(FrequentFlyer frequent_flyer)
    {
        //add this
        if(this->current_status > frequent_flyer.current_status || this->current_status == frequent_flyer.current_status)
        {
            return true;
        }
        else if(this->current_status < frequent_flyer.current_status || this->current_status == frequent_flyer.current_status)
        {
            return false;
        }
        else
        {
            if(this->wait_time > frequent_flyer.wait_time)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    bool FrequentFlyer::operator<=(FrequentFlyer frequent_flyer)
    {
        //add this
        if(this->current_status < frequent_flyer.current_status || this->current_status == frequent_flyer.current_status)
        {
            return true;
        }
        else if(this->current_status > frequent_flyer.current_status || this->current_status == frequent_flyer.current_status)
        {
            return false;
        }
        else
        {
            if(this->wait_time < frequent_flyer.wait_time)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    string FrequentFlyer::toString()
    {
        string f = "hi";
        //cout << "Confirmation Number: " << this.confirmation_number << "\n"
        //<< "Flyer Status: " << this->current_status << "\n" << endl;
        //cout << this->current_status << this->confirmation_number << endl;

        return f; 
    }
    
    
}
