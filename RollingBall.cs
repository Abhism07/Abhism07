using UnityEngine;

public class RollingBall : MonoBehaviour
{
    public float torqueForce = 10f;
    private Rigidbody rb;

    private void Start()
    {
        rb = GetComponent<Rigidbody>();
    }

    private void FixedUpdate()
    {
        // Apply torque force to roll the ball horizontally
        Vector3 torque = new Vector3(0f, 0f, torqueForce);
        rb.AddTorque(torque);
    }
}
