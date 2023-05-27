using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ChangeonHover : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        GameObject Sphere = GameObject.Find("Sphere");

        Sphere.GetComponent<Renderer>().material.color = Color.blue;
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    void OnMouseOver()
    {
        // Change the Color of the GameObject when the mouse hovers over it
        GameObject Sphere = GameObject.Find("Sphere");

        Sphere.GetComponent<Renderer>().material.color = Color.yellow;
    }

    void OnMouseExit()
    {
        // Change the Color of the GameObject when the mouse hovers over it
        GameObject Sphere = GameObject.Find("Sphere");

        Sphere.GetComponent<Renderer>().material.color = Color.blue;
    }
}
