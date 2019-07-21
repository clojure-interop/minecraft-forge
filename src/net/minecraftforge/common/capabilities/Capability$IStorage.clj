(ns net.minecraftforge.common.capabilities.Capability$IStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.capabilities Capability$IStorage]))

(defn write-nbt
  "Serialize the capability instance to a NBTTag.
   This allows for a central implementation of saving the data.

   It is important to note that it is up to the API defining
   the capability what requirements the 'instance' value must have.

   Due to the possibility of manipulating internal data, some
   implementations MAY require that the 'instance' be an instance
   of the 'default' implementation.

   Review the API docs for more info.

  capability - The Capability being stored. - `net.minecraftforge.common.capabilities.Capability`
  instance - An instance of that capabilities interface. - `T`
  side - The side of the object the instance is associated with. - `net.minecraft.util.EnumFacing`

  returns: a NBT holding the data. Null if no data needs to be stored. - `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^Capability$IStorage this ^net.minecraftforge.common.capabilities.Capability capability instance ^net.minecraft.util.EnumFacing side]
    (-> this (.writeNBT capability instance side))))

(defn read-nbt
  "Read the capability instance from a NBT tag.

   This allows for a central implementation of saving the data.

   It is important to note that it is up to the API defining
   the capability what requirements the 'instance' value must have.

   Due to the possibility of manipulating internal data, some
   implementations MAY require that the 'instance' be an instance
   of the 'default' implementation.

   Review the API docs for more info.         *

  capability - The Capability being stored. - `net.minecraftforge.common.capabilities.Capability`
  instance - An instance of that capabilities interface. - `T`
  side - The side of the object the instance is associated with. - `net.minecraft.util.EnumFacing`
  nbt - A NBT holding the data. Must not be null, as doesn't make sense to call this function with nothing to read... - `net.minecraft.nbt.NBTBase`"
  ([^Capability$IStorage this ^net.minecraftforge.common.capabilities.Capability capability instance ^net.minecraft.util.EnumFacing side ^net.minecraft.nbt.NBTBase nbt]
    (-> this (.readNBT capability instance side nbt))))

