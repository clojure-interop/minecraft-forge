(ns net.minecraftforge.fml.common.network.ByteBufUtils
  "Utilities for interacting with ByteBuf."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network ByteBufUtils]))

(defn ->byte-buf-utils
  "Constructor."
  (^ByteBufUtils []
    (new ByteBufUtils )))

(defn *read-var-short
  "An extended length short. Used by custom payload packets to extend size.

  buf - `io.netty.buffer.ByteBuf`

  returns: `int`"
  (^Integer [^io.netty.buffer.ByteBuf buf]
    (ByteBufUtils/readVarShort buf)))

(defn *var-int-byte-count
  "The number of bytes to write the supplied int using the 7 bit varint encoding.

  to-count - The number to analyse - `int`

  returns: The number of bytes it will take to write it (maximum of 5) - `int`"
  (^Integer [^Integer to-count]
    (ByteBufUtils/varIntByteCount to-count)))

(defn *write-tag
  "Write an NBTTagCompound to the byte buffer. It uses the minecraft encoding.

  to - The buffer to write to - `io.netty.buffer.ByteBuf`
  tag - The tag to write - `net.minecraft.nbt.NBTTagCompound`"
  ([^io.netty.buffer.ByteBuf to ^net.minecraft.nbt.NBTTagCompound tag]
    (ByteBufUtils/writeTag to tag)))

(defn *write-var-short
  "buf - `io.netty.buffer.ByteBuf`
  to-write - `int`"
  ([^io.netty.buffer.ByteBuf buf ^Integer to-write]
    (ByteBufUtils/writeVarShort buf to-write)))

(defn *write-utf-8-string
  "Write a String with UTF8 byte encoding to the buffer.
   It is encoded as []

  to - the buffer to write to - `io.netty.buffer.ByteBuf`
  string - The string to write - `java.lang.String`"
  ([^io.netty.buffer.ByteBuf to ^java.lang.String string]
    (ByteBufUtils/writeUTF8String to string)))

(defn *read-utf-8-string
  "Read a UTF8 string from the byte buffer.
   It is encoded as []

  from - The buffer to read from - `io.netty.buffer.ByteBuf`

  returns: The string - `java.lang.String`"
  (^java.lang.String [^io.netty.buffer.ByteBuf from]
    (ByteBufUtils/readUTF8String from)))

(defn *read-tag
  "Read an NBTTagCompound from the byte buffer. It uses the minecraft encoding.

  from - The buffer to read from - `io.netty.buffer.ByteBuf`

  returns: The read tag - `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^io.netty.buffer.ByteBuf from]
    (ByteBufUtils/readTag from)))

(defn *read-item-stack
  "Read an ItemStack from the byte buffer provided. It uses the minecraft encoding.

  from - The buffer to read from - `io.netty.buffer.ByteBuf`

  returns: The itemstack read - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^io.netty.buffer.ByteBuf from]
    (ByteBufUtils/readItemStack from)))

(defn *write-var-int
  "Write an integer to the buffer using variable length encoding. The maxSize constrains
   how many bytes (and therefore the maximum number) that will be written.

  to - The buffer to write to - `io.netty.buffer.ByteBuf`
  to-write - The integer to write - `int`
  max-size - The maximum number of bytes to use - `int`"
  ([^io.netty.buffer.ByteBuf to ^Integer to-write ^Integer max-size]
    (ByteBufUtils/writeVarInt to to-write max-size)))

(defn *read-var-int
  "Read a varint from the supplied buffer.

  buf - The buffer to read from - `io.netty.buffer.ByteBuf`
  max-size - The maximum length of bytes to read - `int`

  returns: The integer - `int`"
  (^Integer [^io.netty.buffer.ByteBuf buf ^Integer max-size]
    (ByteBufUtils/readVarInt buf max-size)))

(defn *write-item-stack
  "Write an ItemStack using minecraft compatible encoding.

  to - The buffer to write to - `io.netty.buffer.ByteBuf`
  stack - The itemstack to write - `net.minecraft.item.ItemStack`"
  ([^io.netty.buffer.ByteBuf to ^net.minecraft.item.ItemStack stack]
    (ByteBufUtils/writeItemStack to stack)))

(defn *get-content-dump
  "buffer - `io.netty.buffer.ByteBuf`

  returns: `java.lang.String`"
  (^java.lang.String [^io.netty.buffer.ByteBuf buffer]
    (ByteBufUtils/getContentDump buffer)))

