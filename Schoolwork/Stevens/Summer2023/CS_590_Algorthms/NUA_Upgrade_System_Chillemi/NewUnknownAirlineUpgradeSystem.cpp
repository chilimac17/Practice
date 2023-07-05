#include "NewUnknownAirlineUpgradeSystem.hpp"

namespace NewUnknownAirlineUpgradeSystem
{

    void NUASystem::systemUpgrade(waitingList::MaxHeap priorityQueue, int num_of_requests, int num_of_cancellation)
    {

        while(true)
        {
            if (returned_passengers.size() == num_of_requests && cancel_counter == num_of_cancellation)
            {
                break;
            }

            if (cancel_counter != num_of_cancellation)
            {
                FrequentFlyer cancelled_passenger;
                cancelled_passenger = priorityQueue.removeMax();
                cancel_counter++;
            }

            if (returned_passengers.size() != num_of_requests)
            {
                returned_passengers.push_back(priorityQueue.removeMax());
            }
        }
        //systemUpgrade(priorityQueue, num_of_requests, num_of_cancellation);
        cancel_counter = 0;
        
        for(int i = 0; i < returned_passengers.size(); i++)
        {
            cout << "STATUS = " << returned_passengers[i].current_status << " CN = " <<  returned_passengers[i].confirmation_number << endl;
        }
    }

    void NUASystem::insertRequests(vector<FrequentFlyer> unorganized_waiting_list)
    {
        for(int i = 0; i < unorganized_waiting_list.size(); i++)
        {
            waitingList.insert(unorganized_waiting_list[i]);
        }
    }
}

