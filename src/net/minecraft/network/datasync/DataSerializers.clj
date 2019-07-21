(ns net.minecraft.network.datasync.DataSerializers
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.datasync DataSerializers]))

(defn ->data-serializers
  "Constructor."
  (^DataSerializers []
    (new DataSerializers )))

(def *-byte
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<java.lang.Byte>"
  DataSerializers/BYTE)

(def *-varint
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<java.lang.Integer>"
  DataSerializers/VARINT)

(def *-float
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<java.lang.Float>"
  DataSerializers/FLOAT)

(def *-string
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<java.lang.String>"
  DataSerializers/STRING)

(def *-text-component
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<net.minecraft.util.text.ITextComponent>"
  DataSerializers/TEXT_COMPONENT)

(def *-optional-item-stack
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<net.minecraft.item.ItemStack>"
  DataSerializers/OPTIONAL_ITEM_STACK)

(def *-optional-block-state
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<com.google.common.base.Optional<net.minecraft.block.state.IBlockState>>"
  DataSerializers/OPTIONAL_BLOCK_STATE)

(def *-boolean
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<java.lang.Boolean>"
  DataSerializers/BOOLEAN)

(def *-rotations
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<net.minecraft.util.math.Rotations>"
  DataSerializers/ROTATIONS)

(def *-block-pos
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<net.minecraft.util.math.BlockPos>"
  DataSerializers/BLOCK_POS)

(def *-optional-block-pos
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<com.google.common.base.Optional<net.minecraft.util.math.BlockPos>>"
  DataSerializers/OPTIONAL_BLOCK_POS)

(def *-facing
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<net.minecraft.util.EnumFacing>"
  DataSerializers/FACING)

(def *-optional-unique-id
  "Static Constant.

  type: net.minecraft.network.datasync.DataSerializer<com.google.common.base.Optional<java.util.UUID>>"
  DataSerializers/OPTIONAL_UNIQUE_ID)

(defn *register-serializer
  "serializer - `net.minecraft.network.datasync.DataSerializer`"
  ([^net.minecraft.network.datasync.DataSerializer serializer]
    (DataSerializers/registerSerializer serializer)))

(defn *get-serializer
  "id - `int`

  returns: `net.minecraft.network.datasync.DataSerializer<?>`"
  (^net.minecraft.network.datasync.DataSerializer [^Integer id]
    (DataSerializers/getSerializer id)))

(defn *get-serializer-id
  "serializer - `net.minecraft.network.datasync.DataSerializer`

  returns: `int`"
  (^Integer [^net.minecraft.network.datasync.DataSerializer serializer]
    (DataSerializers/getSerializerId serializer)))

