(ns net.minecraftforge.common.capabilities.Capability
  "This is the core holder object Capabilities.
  Each capability will have ONE instance of this class,
  and it will the the one passed into the ICapabilityProvider functions.

  The CapabilityManager is in charge of creating this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.capabilities Capability]))

(defn get-name
  "returns: The unique name of this capability, typically this is
   the fully qualified class name for the target interface. - `java.lang.String`"
  (^java.lang.String [^Capability this]
    (-> this (.getName))))

(defn get-storage
  "returns: An instance of the default storage handler. You can safely use this store your default implementation in NBT. - `net.minecraftforge.common.capabilities.Capability$IStorage<T>`"
  (^net.minecraftforge.common.capabilities.Capability$IStorage [^Capability this]
    (-> this (.getStorage))))

(defn read-nbt
  "Quick access to the IStorage's readNBT.
   See Capability.IStorage.readNBT(Capability, Object, EnumFacing, NBTBase)  for documentation.

  instance - `T`
  side - `net.minecraft.util.EnumFacing`
  nbt - `net.minecraft.nbt.NBTBase`"
  ([^Capability this instance ^net.minecraft.util.EnumFacing side ^net.minecraft.nbt.NBTBase nbt]
    (-> this (.readNBT instance side nbt))))

(defn write-nbt
  "Quick access to the IStorage's writeNBT.
   See Capability.IStorage.writeNBT(Capability, Object, EnumFacing) for documentation.

  instance - `T`
  side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^Capability this instance ^net.minecraft.util.EnumFacing side]
    (-> this (.writeNBT instance side))))

(defn get-default-instance
  "A NEW instance of the default implementation.

   If it important to note that if you want to use the default storage
   you may be required to use this exact implementation.
   Refer to the owning API of the Capability in question.

  returns: A NEW instance of the default implementation. - `T`"
  ([^Capability this]
    (-> this (.getDefaultInstance))))

(defn cast
  "Use this inside ICapabilityProvider.getCapability to avoid unchecked cast warnings.
   Example: return SOME_CAPABILITY.cast(instance);
   Use with caution;

  instance - `T`

  returns: `<R> R`"
  ([^Capability this instance]
    (-> this (.cast instance))))

