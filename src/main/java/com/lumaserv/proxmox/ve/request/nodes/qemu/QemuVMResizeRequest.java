package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMResizeRequest extends ProxMoxVERequest<QemuVMResizeRequest> {

    String disk;
    String size;
    String digest;
    @SerializedName("skiplock")
    Integer skipLock;

    public QemuVMResizeRequest setSize(long size) {
        return setSize(size, "");
    }

    public QemuVMResizeRequest setSize(long size, String unit) {
        this.size = size + unit;
        return this;
    }

    public QemuVMResizeRequest setDeltaSize(long size) {
        return setDeltaSize(size, "");
    }

    public QemuVMResizeRequest setDeltaSize(long size, String unit) {
        this.size = "+" + size + unit;
        return this;
    }

    public QemuVMResizeRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
