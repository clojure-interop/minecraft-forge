(ns net.minecraft.nbt.CompressedStreamTools
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt CompressedStreamTools]))

(defn ->compressed-stream-tools
  "Constructor."
  (^CompressedStreamTools []
    (new CompressedStreamTools )))

(defn *read-compressed
  "is - `java.io.InputStream`

  returns: `net.minecraft.nbt.NBTTagCompound`

  throws: java.io.IOException"
  (^net.minecraft.nbt.NBTTagCompound [^java.io.InputStream is]
    (CompressedStreamTools/readCompressed is)))

(defn *write-compressed
  "compound - `net.minecraft.nbt.NBTTagCompound`
  output-stream - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^net.minecraft.nbt.NBTTagCompound compound ^java.io.OutputStream output-stream]
    (CompressedStreamTools/writeCompressed compound output-stream)))

(defn *safe-write
  "compound - `net.minecraft.nbt.NBTTagCompound`
  file-in - `java.io.File`

  throws: java.io.IOException"
  ([^net.minecraft.nbt.NBTTagCompound compound ^java.io.File file-in]
    (CompressedStreamTools/safeWrite compound file-in)))

(defn *read
  "input - `java.io.DataInput`
  accounter - `net.minecraft.nbt.NBTSizeTracker`

  returns: `net.minecraft.nbt.NBTTagCompound`

  throws: java.io.IOException"
  (^net.minecraft.nbt.NBTTagCompound [^java.io.DataInput input ^net.minecraft.nbt.NBTSizeTracker accounter]
    (CompressedStreamTools/read input accounter))
  (^net.minecraft.nbt.NBTTagCompound [^java.io.DataInputStream input-stream]
    (CompressedStreamTools/read input-stream)))

(defn *write
  "compound - `net.minecraft.nbt.NBTTagCompound`
  output - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^net.minecraft.nbt.NBTTagCompound compound ^java.io.DataOutput output]
    (CompressedStreamTools/write compound output)))

