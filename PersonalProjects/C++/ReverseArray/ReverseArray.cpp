#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
    vector<int> num_list {1,2,3,4,5};

    cout << "OLD LIST" << endl;

    for(int i = 0; i < num_list.size(); i++)
    {
        cout << num_list[i] << endl;
    }

    vector<int> reverse_num_list; 
    cout << "num_list size = " << num_list.size() << endl;
    for (int i = num_list.size() - 1; i >= 0; i--)
    {
        cout << "i = " << i << endl;
        cout << "Num_List[" << i << "] = " << num_list[i] << endl;
        reverse_num_list.push_back(num_list[i]);
    }

    cout << "NEW LIST" << endl;

    for(int i = 0; i < reverse_num_list.size(); i++)
    {
        cout << reverse_num_list[i] << endl;
    }
}