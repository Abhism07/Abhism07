using UnityEngine;

public class TransformExample : MonoBehaviour
{
    private Transform myTransform;

    private void Start()
    {
        // Get the Transform component of the current game object
        myTransform = transform;

        // Perform transformations
        TranslateObject();
        RotateObject();
        ScaleObject();
    }

    private void TranslateObject()
    {
        // Translate the game object by a specific distance
        Vector3 translation = new Vector3(2f, 0f, 0f);
        myTransform.position += translation;
    }

    private void RotateObject()
    {
        // Rotate the game object by a specific angle
        Vector3 rotation = new Vector3(0f, 90f, 0f);
        myTransform.rotation *= Quaternion.Euler(rotation);
    }
	 
	 private void ScaleObject()
    {
        // Scale the game object by a specific factor
        Vector3 scale = new Vector3(2f, 2f, 2f);
        myTransform.localScale = Vector3.Scale(myTransform.localScale, scale);
    }
}
