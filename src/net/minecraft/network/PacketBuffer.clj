(ns net.minecraft.network.PacketBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network PacketBuffer]))

(defn ->packet-buffer
  "Constructor.

  wrapped - `io.netty.buffer.ByteBuf`"
  (^PacketBuffer [^io.netty.buffer.ByteBuf wrapped]
    (new PacketBuffer wrapped)))

(defn *get-var-int-size
  "input - `int`

  returns: `int`"
  (^Integer [^Integer input]
    (PacketBuffer/getVarIntSize input)))

(defn release
  "p-release-1 - `int`

  returns: `boolean`"
  (^Boolean [^PacketBuffer this ^Integer p-release-1]
    (-> this (.release p-release-1)))
  (^Boolean [^PacketBuffer this]
    (-> this (.release))))

(defn set-bytes
  "p-set-bytes-1 - `int`
  p-set-bytes-2 - `io.netty.buffer.ByteBuf`
  p-set-bytes-3 - `int`
  p-set-bytes-4 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-bytes-1 ^io.netty.buffer.ByteBuf p-set-bytes-2 ^Integer p-set-bytes-3 ^Integer p-set-bytes-4]
    (-> this (.setBytes p-set-bytes-1 p-set-bytes-2 p-set-bytes-3 p-set-bytes-4)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-bytes-1 ^io.netty.buffer.ByteBuf p-set-bytes-2 ^Integer p-set-bytes-3]
    (-> this (.setBytes p-set-bytes-1 p-set-bytes-2 p-set-bytes-3)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-bytes-1 ^io.netty.buffer.ByteBuf p-set-bytes-2]
    (-> this (.setBytes p-set-bytes-1 p-set-bytes-2))))

(defn read-unsigned-byte
  "returns: `short`"
  (^Short [^PacketBuffer this]
    (-> this (.readUnsignedByte))))

(defn internal-nio-buffer
  "p-internal-nio-buffer-1 - `int`
  p-internal-nio-buffer-2 - `int`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^PacketBuffer this ^Integer p-internal-nio-buffer-1 ^Integer p-internal-nio-buffer-2]
    (-> this (.internalNioBuffer p-internal-nio-buffer-1 p-internal-nio-buffer-2))))

(defn array-offset
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.arrayOffset))))

(defn read-bytes
  "p-read-bytes-1 - `io.netty.buffer.ByteBuf`
  p-read-bytes-2 - `int`
  p-read-bytes-3 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^io.netty.buffer.ByteBuf p-read-bytes-1 ^Integer p-read-bytes-2 ^Integer p-read-bytes-3]
    (-> this (.readBytes p-read-bytes-1 p-read-bytes-2 p-read-bytes-3)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^io.netty.buffer.ByteBuf p-read-bytes-1 ^Integer p-read-bytes-2]
    (-> this (.readBytes p-read-bytes-1 p-read-bytes-2)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-read-bytes-1]
    (-> this (.readBytes p-read-bytes-1))))

(defn get-byte
  "p-get-byte-1 - `int`

  returns: `byte`"
  (^Byte [^PacketBuffer this ^Integer p-get-byte-1]
    (-> this (.getByte p-get-byte-1))))

(defn read-slice
  "p-read-slice-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-read-slice-1]
    (-> this (.readSlice p-read-slice-1))))

(defn reader-index
  "p-reader-index-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-reader-index-1]
    (-> this (.readerIndex p-reader-index-1)))
  (^Integer [^PacketBuffer this]
    (-> this (.readerIndex))))

(defn read-enum-value
  "enum-class - `java.lang.Class`

  returns: `<T extends java.lang.Enum<T>> T`"
  ([^PacketBuffer this ^java.lang.Class enum-class]
    (-> this (.readEnumValue enum-class))))

(defn discard-read-bytes
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.discardReadBytes))))

(defn write-unique-id
  "uuid - `java.util.UUID`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^java.util.UUID uuid]
    (-> this (.writeUniqueId uuid))))

(defn readable?
  "p-is-readable-1 - `int`

  returns: `boolean`"
  (^Boolean [^PacketBuffer this ^Integer p-is-readable-1]
    (-> this (.isReadable p-is-readable-1)))
  (^Boolean [^PacketBuffer this]
    (-> this (.isReadable))))

(defn set-boolean
  "p-set-boolean-1 - `int`
  p-set-boolean-2 - `boolean`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-boolean-1 ^Boolean p-set-boolean-2]
    (-> this (.setBoolean p-set-boolean-1 p-set-boolean-2))))

(defn read-byte
  "returns: `byte`"
  (^Byte [^PacketBuffer this]
    (-> this (.readByte))))

(defn copy
  "p-copy-1 - `int`
  p-copy-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-copy-1 ^Integer p-copy-2]
    (-> this (.copy p-copy-1 p-copy-2)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.copy))))

(defn write-medium
  "p-write-medium-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-medium-1]
    (-> this (.writeMedium p-write-medium-1))))

(defn read-char
  "returns: `char`"
  (^Character [^PacketBuffer this]
    (-> this (.readChar))))

(defn get-unsigned-int
  "p-get-unsigned-int-1 - `int`

  returns: `long`"
  (^Long [^PacketBuffer this ^Integer p-get-unsigned-int-1]
    (-> this (.getUnsignedInt p-get-unsigned-int-1))))

(defn for-each-byte
  "p-for-each-byte-1 - `int`
  p-for-each-byte-2 - `int`
  p-for-each-byte-3 - `io.netty.buffer.ByteBufProcessor`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-for-each-byte-1 ^Integer p-for-each-byte-2 ^io.netty.buffer.ByteBufProcessor p-for-each-byte-3]
    (-> this (.forEachByte p-for-each-byte-1 p-for-each-byte-2 p-for-each-byte-3)))
  (^Integer [^PacketBuffer this ^io.netty.buffer.ByteBufProcessor p-for-each-byte-1]
    (-> this (.forEachByte p-for-each-byte-1))))

(defn write-bytes
  "p-write-bytes-1 - `io.netty.buffer.ByteBuf`
  p-write-bytes-2 - `int`
  p-write-bytes-3 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^io.netty.buffer.ByteBuf p-write-bytes-1 ^Integer p-write-bytes-2 ^Integer p-write-bytes-3]
    (-> this (.writeBytes p-write-bytes-1 p-write-bytes-2 p-write-bytes-3)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^io.netty.buffer.ByteBuf p-write-bytes-1 ^Integer p-write-bytes-2]
    (-> this (.writeBytes p-write-bytes-1 p-write-bytes-2)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^io.netty.buffer.ByteBuf p-write-bytes-1]
    (-> this (.writeBytes p-write-bytes-1))))

(defn for-each-byte-desc
  "p-for-each-byte-desc-1 - `int`
  p-for-each-byte-desc-2 - `int`
  p-for-each-byte-desc-3 - `io.netty.buffer.ByteBufProcessor`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-for-each-byte-desc-1 ^Integer p-for-each-byte-desc-2 ^io.netty.buffer.ByteBufProcessor p-for-each-byte-desc-3]
    (-> this (.forEachByteDesc p-for-each-byte-desc-1 p-for-each-byte-desc-2 p-for-each-byte-desc-3)))
  (^Integer [^PacketBuffer this ^io.netty.buffer.ByteBufProcessor p-for-each-byte-desc-1]
    (-> this (.forEachByteDesc p-for-each-byte-desc-1))))

(defn write-zero
  "p-write-zero-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-zero-1]
    (-> this (.writeZero p-write-zero-1))))

(defn write-double
  "p-write-double-1 - `double`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Double p-write-double-1]
    (-> this (.writeDouble p-write-double-1))))

(defn write-compound-tag
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeCompoundTag nbt))))

(defn get-medium
  "p-get-medium-1 - `int`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-get-medium-1]
    (-> this (.getMedium p-get-medium-1))))

(defn max-writable-bytes
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.maxWritableBytes))))

(defn read-float
  "returns: `float`"
  (^Float [^PacketBuffer this]
    (-> this (.readFloat))))

(defn get-unsigned-medium
  "p-get-unsigned-medium-1 - `int`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-get-unsigned-medium-1]
    (-> this (.getUnsignedMedium p-get-unsigned-medium-1))))

(defn get-short
  "p-get-short-1 - `int`

  returns: `short`"
  (^Short [^PacketBuffer this ^Integer p-get-short-1]
    (-> this (.getShort p-get-short-1))))

(defn nio-buffer-count
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.nioBufferCount))))

(defn ensure-writable
  "p-ensure-writable-1 - `int`
  p-ensure-writable-2 - `boolean`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-ensure-writable-1 ^Boolean p-ensure-writable-2]
    (-> this (.ensureWritable p-ensure-writable-1 p-ensure-writable-2)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-ensure-writable-1]
    (-> this (.ensureWritable p-ensure-writable-1))))

(defn write-boolean
  "p-write-boolean-1 - `boolean`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Boolean p-write-boolean-1]
    (-> this (.writeBoolean p-write-boolean-1))))

(defn to-string
  "p-to-string-1 - `int`
  p-to-string-2 - `int`
  p-to-string-3 - `java.nio.charset.Charset`

  returns: `java.lang.String`"
  (^java.lang.String [^PacketBuffer this ^Integer p-to-string-1 ^Integer p-to-string-2 ^java.nio.charset.Charset p-to-string-3]
    (-> this (.toString p-to-string-1 p-to-string-2 p-to-string-3)))
  (^java.lang.String [^PacketBuffer this ^java.nio.charset.Charset p-to-string-1]
    (-> this (.toString p-to-string-1)))
  (^java.lang.String [^PacketBuffer this]
    (-> this (.toString))))

(defn get-unsigned-byte
  "p-get-unsigned-byte-1 - `int`

  returns: `short`"
  (^Short [^PacketBuffer this ^Integer p-get-unsigned-byte-1]
    (-> this (.getUnsignedByte p-get-unsigned-byte-1))))

(defn write-block-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.writeBlockPos pos))))

(defn write-long
  "p-write-long-1 - `long`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Long p-write-long-1]
    (-> this (.writeLong p-write-long-1))))

(defn write-short
  "p-write-short-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-short-1]
    (-> this (.writeShort p-write-short-1))))

(defn read-unsigned-medium
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readUnsignedMedium))))

(defn bytes-before
  "p-bytes-before-1 - `int`
  p-bytes-before-2 - `int`
  p-bytes-before-3 - `byte`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-bytes-before-1 ^Integer p-bytes-before-2 ^Byte p-bytes-before-3]
    (-> this (.bytesBefore p-bytes-before-1 p-bytes-before-2 p-bytes-before-3)))
  (^Integer [^PacketBuffer this ^Integer p-bytes-before-1 ^Byte p-bytes-before-2]
    (-> this (.bytesBefore p-bytes-before-1 p-bytes-before-2)))
  (^Integer [^PacketBuffer this ^Byte p-bytes-before-1]
    (-> this (.bytesBefore p-bytes-before-1))))

(defn read-byte-array
  "max-length - `int`

  returns: `byte[]`"
  ([^PacketBuffer this ^Integer max-length]
    (-> this (.readByteArray max-length)))
  ([^PacketBuffer this]
    (-> this (.readByteArray))))

(defn get-bytes
  "p-get-bytes-1 - `int`
  p-get-bytes-2 - `io.netty.buffer.ByteBuf`
  p-get-bytes-3 - `int`
  p-get-bytes-4 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-get-bytes-1 ^io.netty.buffer.ByteBuf p-get-bytes-2 ^Integer p-get-bytes-3 ^Integer p-get-bytes-4]
    (-> this (.getBytes p-get-bytes-1 p-get-bytes-2 p-get-bytes-3 p-get-bytes-4)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-get-bytes-1 ^io.netty.buffer.ByteBuf p-get-bytes-2 ^Integer p-get-bytes-3]
    (-> this (.getBytes p-get-bytes-1 p-get-bytes-2 p-get-bytes-3)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-get-bytes-1 ^io.netty.buffer.ByteBuf p-get-bytes-2]
    (-> this (.getBytes p-get-bytes-1 p-get-bytes-2))))

(defn unwrap
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.unwrap))))

(defn writable-bytes
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.writableBytes))))

(defn write-var-int-array
  "array - `int[]`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this array]
    (-> this (.writeVarIntArray array))))

(defn duplicate
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.duplicate))))

(defn memory-address
  "returns: `long`"
  (^Long [^PacketBuffer this]
    (-> this (.memoryAddress))))

(defn readable-bytes
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readableBytes))))

(defn has-memory-address?
  "returns: `boolean`"
  (^Boolean [^PacketBuffer this]
    (-> this (.hasMemoryAddress))))

(defn read-boolean
  "returns: `boolean`"
  (^Boolean [^PacketBuffer this]
    (-> this (.readBoolean))))

(defn get-long
  "p-get-long-1 - `int`

  returns: `long`"
  (^Long [^PacketBuffer this ^Integer p-get-long-1]
    (-> this (.getLong p-get-long-1))))

(defn retain
  "p-retain-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-retain-1]
    (-> this (.retain p-retain-1)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.retain))))

(defn read-int
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readInt))))

(defn read-string
  "max-length - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^PacketBuffer this ^Integer max-length]
    (-> this (.readString max-length))))

(defn read-compound-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`

  throws: java.io.IOException"
  (^net.minecraft.nbt.NBTTagCompound [^PacketBuffer this]
    (-> this (.readCompoundTag))))

(defn has-array?
  "returns: `boolean`"
  (^Boolean [^PacketBuffer this]
    (-> this (.hasArray))))

(defn nio-buffer
  "p-nio-buffer-1 - `int`
  p-nio-buffer-2 - `int`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^PacketBuffer this ^Integer p-nio-buffer-1 ^Integer p-nio-buffer-2]
    (-> this (.nioBuffer p-nio-buffer-1 p-nio-buffer-2)))
  (^java.nio.ByteBuffer [^PacketBuffer this]
    (-> this (.nioBuffer))))

(defn set-double
  "p-set-double-1 - `int`
  p-set-double-2 - `double`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-double-1 ^Double p-set-double-2]
    (-> this (.setDouble p-set-double-1 p-set-double-2))))

(defn read-long
  "returns: `long`"
  (^Long [^PacketBuffer this]
    (-> this (.readLong))))

(defn alloc
  "returns: `io.netty.buffer.ByteBufAllocator`"
  (^io.netty.buffer.ByteBufAllocator [^PacketBuffer this]
    (-> this (.alloc))))

(defn get-int
  "p-get-int-1 - `int`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-get-int-1]
    (-> this (.getInt p-get-int-1))))

(defn write-string
  "string - `java.lang.String`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^java.lang.String string]
    (-> this (.writeString string))))

(defn max-capacity
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.maxCapacity))))

(defn set-long
  "p-set-long-1 - `int`
  p-set-long-2 - `long`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-long-1 ^Long p-set-long-2]
    (-> this (.setLong p-set-long-1 p-set-long-2))))

(defn read-medium
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readMedium))))

(defn reset-reader-index
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.resetReaderIndex))))

(defn write-text-component
  "component - `net.minecraft.util.text.ITextComponent`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.writeTextComponent component))))

(defn get-char
  "p-get-char-1 - `int`

  returns: `char`"
  (^Character [^PacketBuffer this ^Integer p-get-char-1]
    (-> this (.getChar p-get-char-1))))

(defn writer-index
  "p-writer-index-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-writer-index-1]
    (-> this (.writerIndex p-writer-index-1)))
  (^Integer [^PacketBuffer this]
    (-> this (.writerIndex))))

(defn read-text-component
  "returns: `net.minecraft.util.text.ITextComponent`

  throws: java.io.IOException"
  (^net.minecraft.util.text.ITextComponent [^PacketBuffer this]
    (-> this (.readTextComponent))))

(defn write-long-array
  "array - `long[]`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this array]
    (-> this (.writeLongArray array))))

(defn direct?
  "returns: `boolean`"
  (^Boolean [^PacketBuffer this]
    (-> this (.isDirect))))

(defn set-index
  "p-set-index-1 - `int`
  p-set-index-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-index-1 ^Integer p-set-index-2]
    (-> this (.setIndex p-set-index-1 p-set-index-2))))

(defn read-item-stack
  "returns: `net.minecraft.item.ItemStack`

  throws: java.io.IOException"
  (^net.minecraft.item.ItemStack [^PacketBuffer this]
    (-> this (.readItemStack))))

(defn read-var-long
  "returns: `long`"
  (^Long [^PacketBuffer this]
    (-> this (.readVarLong))))

(defn write-var-long
  "value - `long`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^Long value]
    (-> this (.writeVarLong value))))

(defn write-enum-value
  "value - `java.lang.Enum`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^java.lang.Enum value]
    (-> this (.writeEnumValue value))))

(defn set-byte
  "p-set-byte-1 - `int`
  p-set-byte-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-byte-1 ^Integer p-set-byte-2]
    (-> this (.setByte p-set-byte-1 p-set-byte-2))))

(defn order
  "p-order-1 - `java.nio.ByteOrder`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^java.nio.ByteOrder p-order-1]
    (-> this (.order p-order-1)))
  (^java.nio.ByteOrder [^PacketBuffer this]
    (-> this (.order))))

(defn write-var-int
  "input - `int`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^Integer input]
    (-> this (.writeVarInt input))))

(defn set-short
  "p-set-short-1 - `int`
  p-set-short-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-short-1 ^Integer p-set-short-2]
    (-> this (.setShort p-set-short-1 p-set-short-2))))

(defn write-byte-array
  "array - `byte[]`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this array]
    (-> this (.writeByteArray array))))

(defn write-int
  "p-write-int-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-int-1]
    (-> this (.writeInt p-write-int-1))))

(defn write-float
  "p-write-float-1 - `float`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Float p-write-float-1]
    (-> this (.writeFloat p-write-float-1))))

(defn read-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^PacketBuffer this]
    (-> this (.readUniqueId))))

(defn get-unsigned-short
  "p-get-unsigned-short-1 - `int`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-get-unsigned-short-1]
    (-> this (.getUnsignedShort p-get-unsigned-short-1))))

(defn reset-writer-index
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.resetWriterIndex))))

(defn set-int
  "p-set-int-1 - `int`
  p-set-int-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-int-1 ^Integer p-set-int-2]
    (-> this (.setInt p-set-int-1 p-set-int-2))))

(defn slice
  "p-slice-1 - `int`
  p-slice-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-slice-1 ^Integer p-slice-2]
    (-> this (.slice p-slice-1 p-slice-2)))
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.slice))))

(defn set-medium
  "p-set-medium-1 - `int`
  p-set-medium-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-medium-1 ^Integer p-set-medium-2]
    (-> this (.setMedium p-set-medium-1 p-set-medium-2))))

(defn read-short
  "returns: `short`"
  (^Short [^PacketBuffer this]
    (-> this (.readShort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.hashCode))))

(defn skip-bytes
  "p-skip-bytes-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-skip-bytes-1]
    (-> this (.skipBytes p-skip-bytes-1))))

(defn ref-cnt
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.refCnt))))

(defn read-var-int
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readVarInt))))

(defn get-boolean?
  "p-get-boolean-1 - `int`

  returns: `boolean`"
  (^Boolean [^PacketBuffer this ^Integer p-get-boolean-1]
    (-> this (.getBoolean p-get-boolean-1))))

(defn set-zero
  "p-set-zero-1 - `int`
  p-set-zero-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-zero-1 ^Integer p-set-zero-2]
    (-> this (.setZero p-set-zero-1 p-set-zero-2))))

(defn discard-some-read-bytes
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.discardSomeReadBytes))))

(defn write-char
  "p-write-char-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-char-1]
    (-> this (.writeChar p-write-char-1))))

(defn read-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^PacketBuffer this]
    (-> this (.readBlockPos))))

(defn nio-buffers
  "p-nio-buffers-1 - `int`
  p-nio-buffers-2 - `int`

  returns: `java.nio.ByteBuffer[]`"
  ([^PacketBuffer this ^Integer p-nio-buffers-1 ^Integer p-nio-buffers-2]
    (-> this (.nioBuffers p-nio-buffers-1 p-nio-buffers-2)))
  ([^PacketBuffer this]
    (-> this (.nioBuffers))))

(defn write-byte
  "p-write-byte-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-write-byte-1]
    (-> this (.writeByte p-write-byte-1))))

(defn clear
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.clear))))

(defn compare-to
  "p-compare-to-1 - `io.netty.buffer.ByteBuf`

  returns: `int`"
  (^Integer [^PacketBuffer this ^io.netty.buffer.ByteBuf p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn index-of
  "p-index-of-1 - `int`
  p-index-of-2 - `int`
  p-index-of-3 - `byte`

  returns: `int`"
  (^Integer [^PacketBuffer this ^Integer p-index-of-1 ^Integer p-index-of-2 ^Byte p-index-of-3]
    (-> this (.indexOf p-index-of-1 p-index-of-2 p-index-of-3))))

(defn writable?
  "p-is-writable-1 - `int`

  returns: `boolean`"
  (^Boolean [^PacketBuffer this ^Integer p-is-writable-1]
    (-> this (.isWritable p-is-writable-1)))
  (^Boolean [^PacketBuffer this]
    (-> this (.isWritable))))

(defn read-double
  "returns: `double`"
  (^Double [^PacketBuffer this]
    (-> this (.readDouble))))

(defn get-float
  "p-get-float-1 - `int`

  returns: `float`"
  (^Float [^PacketBuffer this ^Integer p-get-float-1]
    (-> this (.getFloat p-get-float-1))))

(defn get-double
  "p-get-double-1 - `int`

  returns: `double`"
  (^Double [^PacketBuffer this ^Integer p-get-double-1]
    (-> this (.getDouble p-get-double-1))))

(defn read-var-int-array
  "max-length - `int`

  returns: `int[]`"
  ([^PacketBuffer this ^Integer max-length]
    (-> this (.readVarIntArray max-length)))
  ([^PacketBuffer this]
    (-> this (.readVarIntArray))))

(defn capacity
  "p-capacity-1 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-capacity-1]
    (-> this (.capacity p-capacity-1)))
  (^Integer [^PacketBuffer this]
    (-> this (.capacity))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PacketBuffer this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn mark-writer-index
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.markWriterIndex))))

(defn array
  "returns: `byte[]`"
  ([^PacketBuffer this]
    (-> this (.array))))

(defn set-float
  "p-set-float-1 - `int`
  p-set-float-2 - `float`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-float-1 ^Float p-set-float-2]
    (-> this (.setFloat p-set-float-1 p-set-float-2))))

(defn read-unsigned-int
  "returns: `long`"
  (^Long [^PacketBuffer this]
    (-> this (.readUnsignedInt))))

(defn mark-reader-index
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this]
    (-> this (.markReaderIndex))))

(defn write-item-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^PacketBuffer this ^net.minecraft.item.ItemStack stack]
    (-> this (.writeItemStack stack))))

(defn set-char
  "p-set-char-1 - `int`
  p-set-char-2 - `int`

  returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^PacketBuffer this ^Integer p-set-char-1 ^Integer p-set-char-2]
    (-> this (.setChar p-set-char-1 p-set-char-2))))

(defn read-long-array
  "array - `long[]`
  max-length - `int`

  returns: `long[]`"
  ([^PacketBuffer this array ^Integer max-length]
    (-> this (.readLongArray array max-length)))
  ([^PacketBuffer this array]
    (-> this (.readLongArray array))))

(defn read-unsigned-short
  "returns: `int`"
  (^Integer [^PacketBuffer this]
    (-> this (.readUnsignedShort))))

