(ns net.minecraftforge.fml.common.event.FMLInterModComms$IMCMessage
  "You will receive an instance of this for each message sent"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLInterModComms$IMCMessage]))

(defn key
  "Instance Constant.

  This field, and value are both at the mod's discretion

  type: java.lang.String"
  (^java.lang.String [^FMLInterModComms$IMCMessage this]
    (-> this .-key)))

(defn get-function-value
  "Get the Function value from this message. This will attempt to classload the function
   supplied by the caller. The parameter classes are strictly to give a concrete generic function return value.

  function-from - The type of the argument to the function - `java.lang.Class`
  function-to - The type of the result of the function - `java.lang.Class`

  returns: The function value or Optional.absent if it wasn't readable or isn't a function call - `<T,V> com.google.common.base.Optional<com.google.common.base.Function<T,V>>`"
  ([^FMLInterModComms$IMCMessage this ^java.lang.Class function-from ^java.lang.Class function-to]
    (-> this (.getFunctionValue function-from function-to))))

(defn get-item-stack-value
  "Get the ItemStack value from this message

  returns: The Itemstack value - `net.minecraft.item.ItemStack`

  throws: java.lang.ClassCastException - if this message doesn't contain an Itemstack value"
  (^net.minecraft.item.ItemStack [^FMLInterModComms$IMCMessage this]
    (-> this (.getItemStackValue))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLInterModComms$IMCMessage this]
    (-> this (.toString))))

(defn get-message-type
  "Get the actual message class type

  returns: The type of the message - `java.lang.Class<?>`"
  (^java.lang.Class [^FMLInterModComms$IMCMessage this]
    (-> this (.getMessageType))))

(defn get-sender
  "Get the sending modId of this message.

  returns: The modId of the mod that originated the message - `java.lang.String`"
  (^java.lang.String [^FMLInterModComms$IMCMessage this]
    (-> this (.getSender))))

(defn resource-location-message?
  "Is this an ResourceLocation type message

  returns: if this is an NBT type message - `boolean`"
  (^Boolean [^FMLInterModComms$IMCMessage this]
    (-> this (.isResourceLocationMessage))))

(defn item-stack-message?
  "Is this an ItemStack type message

  returns: if this is an itemstack type message - `boolean`"
  (^Boolean [^FMLInterModComms$IMCMessage this]
    (-> this (.isItemStackMessage))))

(defn function-message?
  "Is this a Function type message

  returns: if this is a function type message - `boolean`"
  (^Boolean [^FMLInterModComms$IMCMessage this]
    (-> this (.isFunctionMessage))))

(defn get-string-value
  "Get the string value from this message.

  returns: The string value - `java.lang.String`

  throws: java.lang.ClassCastException - if this message doesn't contain a String value"
  (^java.lang.String [^FMLInterModComms$IMCMessage this]
    (-> this (.getStringValue))))

(defn string-message?
  "Is this a string type message

  returns: if this is a string type message - `boolean`"
  (^Boolean [^FMLInterModComms$IMCMessage this]
    (-> this (.isStringMessage))))

(defn get-nbt-value
  "Get the NBTTagCompound value from this message

  returns: The NBT value - `net.minecraft.nbt.NBTTagCompound`

  throws: java.lang.ClassCastException - if this message doesn't contain an NBT value"
  (^net.minecraft.nbt.NBTTagCompound [^FMLInterModComms$IMCMessage this]
    (-> this (.getNBTValue))))

(defn get-resource-location-value
  "Get the ResourceLocation value from this message.

  returns: The string value - `net.minecraft.util.ResourceLocation`

  throws: java.lang.ClassCastException - if this message doesn't contain a ResourceLocation value"
  (^net.minecraft.util.ResourceLocation [^FMLInterModComms$IMCMessage this]
    (-> this (.getResourceLocationValue))))

(defn nbt-message?
  "Is this an NBTTagCompound type message

  returns: if this is an NBT type message - `boolean`"
  (^Boolean [^FMLInterModComms$IMCMessage this]
    (-> this (.isNBTMessage))))

