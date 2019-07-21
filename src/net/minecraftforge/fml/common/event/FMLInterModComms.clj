(ns net.minecraftforge.fml.common.event.FMLInterModComms
  "Simple intermod communications to receive simple messages directed at you
  from other mods"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLInterModComms]))

(defn ->fml-inter-mod-comms
  "Constructor."
  (^FMLInterModComms []
    (new FMLInterModComms )))

(defn *send-message
  "Send a startup time message

  mod-id - The modid to send it to - `java.lang.String`
  key - The mod specific key - `java.lang.String`
  value - An NBT type value - `net.minecraft.nbt.NBTTagCompound`

  returns: if the message was enqueued successfully and will be processed during startup - `boolean`"
  (^Boolean [^java.lang.String mod-id ^java.lang.String key ^net.minecraft.nbt.NBTTagCompound value]
    (FMLInterModComms/sendMessage mod-id key value)))

(defn *send-function-message
  "Send a startup time function message

  mod-id - The modid to send it to - `java.lang.String`
  key - The mod specific key - `java.lang.String`
  function-class-name - The class name of a function that will be instantiated when the message is read. It must implement Function - `java.lang.String`

  returns: if the message was enqueued successfully and will be processed during startup - `boolean`"
  (^Boolean [^java.lang.String mod-id ^java.lang.String key ^java.lang.String function-class-name]
    (FMLInterModComms/sendFunctionMessage mod-id key function-class-name)))

(defn *send-runtime-message
  "Send a post-startup message

  source-mod - The mod sending the message - `java.lang.Object`
  mod-id - The modid to send it to - `java.lang.String`
  key - The mod specific key - `java.lang.String`
  value - An NBT type value - `net.minecraft.nbt.NBTTagCompound`"
  ([^java.lang.Object source-mod ^java.lang.String mod-id ^java.lang.String key ^net.minecraft.nbt.NBTTagCompound value]
    (FMLInterModComms/sendRuntimeMessage source-mod mod-id key value)))

(defn *send-runtime-function-message
  "Send a post-startup function message.

  source-mod - The mod originating this message - `java.lang.Object`
  mod-id - The modid to send it to - `java.lang.String`
  key - The mod specific key - `java.lang.String`
  function-class-name - The name of a class to be loaded when the caller processes this message. The named class must extend Function - `java.lang.String`"
  ([^java.lang.Object source-mod ^java.lang.String mod-id ^java.lang.String key ^java.lang.String function-class-name]
    (FMLInterModComms/sendRuntimeFunctionMessage source-mod mod-id key function-class-name)))

(defn *fetch-runtime-messages
  "Retrieve any pending runtime messages for the mod

  for-mod - The Mod.Instance of the Mod to fetch messages for - `java.lang.Object`

  returns: any messages - the collection will never be null - `com.google.common.collect.ImmutableList<net.minecraftforge.fml.common.event.FMLInterModComms$IMCMessage>`"
  (^com.google.common.collect.ImmutableList [^java.lang.Object for-mod]
    (FMLInterModComms/fetchRuntimeMessages for-mod)))

