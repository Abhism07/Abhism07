using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ChangeonClick : MonoBehaviour
{
    bool flag;
    // Start is called before the first frame update
    void Start()
    {
        GameObject Cube = GameObject.Find("Cube");

        Cube.GetComponent<Renderer>().material.color = Color.red;
        flag = true;

    }

    // Update is called once per frame
    void Update()
    {
        GameObject Cube = GameObject.Find("Cube");
        if (Input.GetMouseButtonDown(0))
        {
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            RaycastHit hit;
            if (Physics.Raycast(ray, out hit))
            {
                if (hit.transform.name == "Cube")
                {
                    if (flag)
                    {
                        Cube.GetComponent<Renderer>().material.color = Color.green;
                        flag = false;
                    }
                    else
                    {
                        Cube.GetComponent<Renderer>().material.color = Color.red;
                        flag = true;
                    }
                }
            }
        }
    }
}
