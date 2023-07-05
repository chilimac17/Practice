#include "NewUnknownAirlineUpgradeSystem.hpp"
#include <iostream>

using namespace std;

int main()
{
    NewUnknownAirlineUpgradeSystem::NUASystem NUA;
    vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> new_waiting_list;
    //vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> passengers_moving_to_flight;
    //change to in place
    
    
    new_waiting_list.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(3, NewUnknownAirlineUpgradeSystem::FrequentFlyer::SILVER, 90));
    new_waiting_list.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(2, NewUnknownAirlineUpgradeSystem::FrequentFlyer::GOLD, 60));
    new_waiting_list.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(1, NewUnknownAirlineUpgradeSystem::FrequentFlyer::PLATINUM, 30));
    new_waiting_list.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(4, NewUnknownAirlineUpgradeSystem::FrequentFlyer::SUPER, 120));

    cout << "Constructing Max Heap" << endl;
    NUA.insertRequests(new_waiting_list);
    NUA.systemUpgrade(NUA.waitingList, 1, 2);
    
    NewUnknownAirlineUpgradeSystem::NUASystem NUA2;
    vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> new_waiting_list2;

    new_waiting_list2.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(4, NewUnknownAirlineUpgradeSystem::FrequentFlyer::SILVER, 150));
    new_waiting_list2.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(2, NewUnknownAirlineUpgradeSystem::FrequentFlyer::GOLD, 130));
    new_waiting_list2.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(1, NewUnknownAirlineUpgradeSystem::FrequentFlyer::PLATINUM, 120));
    new_waiting_list2.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(5, NewUnknownAirlineUpgradeSystem::FrequentFlyer::SUPER, 60));
    new_waiting_list2.emplace_back(NewUnknownAirlineUpgradeSystem::FrequentFlyer(3, NewUnknownAirlineUpgradeSystem::FrequentFlyer::SUPER, 140));

    cout << "Constructing Max Heap PT 2" << endl;
    NUA2.insertRequests(new_waiting_list2);
    NUA2.systemUpgrade(NUA2.waitingList, 2, 1);

    //delete NUA;

    return 0;
}