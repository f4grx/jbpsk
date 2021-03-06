package net.f4grx.audiobpsk;

/**
 *
 * @author f4grx
 */
public interface BpskDecoderCallback {
    public void onBuffer(double[] buf, double freq);
    public void onLock(boolean locked, double error, double freq);
}
