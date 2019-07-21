(ns net.minecraftforge.fml.common.FMLContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common FMLContainer]))

(defn ->fml-container
  "Constructor."
  (^FMLContainer []
    (new FMLContainer )))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^FMLContainer this]
    (-> this (.getSigningCertificate))))

(defn get-mod
  "Description copied from interface: ModContainer

  returns: `java.lang.Object`"
  (^java.lang.Object [^FMLContainer this]
    (-> this (.getMod))))

(defn check-mod-lists
  "mod-list - `java.util.Map`
  side - `net.minecraftforge.fml.relauncher.Side`

  returns: `boolean`"
  (^Boolean [^FMLContainer this ^java.util.Map mod-list ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.checkModLists mod-list side))))

(defn get-data-for-writing
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^FMLContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info]
    (-> this (.getDataForWriting handler info))))

(defn read-data
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`
  property-map - `java.util.Map`
  tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^FMLContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info ^java.util.Map property-map ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.readData handler info property-map tag))))

(defn mod-construction
  "evt - `net.minecraftforge.fml.common.event.FMLConstructionEvent`"
  ([^FMLContainer this ^net.minecraftforge.fml.common.event.FMLConstructionEvent evt]
    (-> this (.modConstruction evt))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^FMLContainer this]
    (-> this (.getSource))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^FMLContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn mod-preinitialization
  "evt - `net.minecraftforge.fml.common.event.FMLPreInitializationEvent`"
  ([^FMLContainer this ^net.minecraftforge.fml.common.event.FMLPreInitializationEvent evt]
    (-> this (.modPreinitialization evt))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^FMLContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

