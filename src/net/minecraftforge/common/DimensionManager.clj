(ns net.minecraftforge.common.DimensionManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common DimensionManager]))

(defn ->dimension-manager
  "Constructor."
  (^DimensionManager []
    (new DimensionManager )))

(defn *save-dimension-data-map
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound []
    (DimensionManager/saveDimensionDataMap )))

(defn *init-dimension
  "dim - `int`"
  ([^Integer dim]
    (DimensionManager/initDimension dim)))

(defn *set-world
  "id - `int`
  world - `net.minecraft.world.WorldServer`
  server - `net.minecraft.server.MinecraftServer`"
  ([^Integer id ^net.minecraft.world.WorldServer world ^net.minecraft.server.MinecraftServer server]
    (DimensionManager/setWorld id world server)))

(defn *get-dimensions
  "Returns a list of dimensions associated with this DimensionType.

  type - `net.minecraft.world.DimensionType`

  returns: `int[]`"
  ([^net.minecraft.world.DimensionType type]
    (DimensionManager/getDimensions type)))

(defn *get-worlds
  "returns: `net.minecraft.world.WorldServer[]`"
  ([]
    (DimensionManager/getWorlds )))

(defn *get-i-ds
  "check - `boolean`

  returns: `java.lang.Integer[]`"
  ([^Boolean check]
    (DimensionManager/getIDs check))
  ([]
    (DimensionManager/getIDs )))

(defn *get-current-save-root-directory
  "Return the current root directory for the world save. Accesses getSaveHandler from the overworld

  returns: the root directory of the save - `java.io.File`"
  (^java.io.File []
    (DimensionManager/getCurrentSaveRootDirectory )))

(defn *unload-worlds
  "world-tick-times - `java.util.Hashtable`"
  ([^java.util.Hashtable world-tick-times]
    (DimensionManager/unloadWorlds world-tick-times)))

(defn *get-provider
  "dim - `int`

  returns: `net.minecraft.world.WorldProvider`"
  (^net.minecraft.world.WorldProvider [^Integer dim]
    (DimensionManager/getProvider dim)))

(defn *get-next-free-dim-id
  "Return the next free dimension ID. Note: you are not guaranteed a contiguous
   block of free ids. Always call for each individual ID you wish to get.

  returns: the next free dimension ID - `int`"
  (^Integer []
    (DimensionManager/getNextFreeDimId )))

(defn *get-provider-type
  "dim - `int`

  returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^Integer dim]
    (DimensionManager/getProviderType dim)))

(defn *load-dimension-data-map
  "compound-tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^net.minecraft.nbt.NBTTagCompound compound-tag]
    (DimensionManager/loadDimensionDataMap compound-tag)))

(defn *get-world
  "id - `int`

  returns: `net.minecraft.world.WorldServer`"
  (^net.minecraft.world.WorldServer [^Integer id]
    (DimensionManager/getWorld id)))

(defn *unload-world
  "id - `int`"
  ([^Integer id]
    (DimensionManager/unloadWorld id)))

(defn *init
  ""
  ([]
    (DimensionManager/init )))

(defn *dimension-registered?
  "dim - `int`

  returns: `boolean`"
  (^Boolean [^Integer dim]
    (DimensionManager/isDimensionRegistered dim)))

(defn *register-dimension
  "id - `int`
  type - `net.minecraft.world.DimensionType`"
  ([^Integer id ^net.minecraft.world.DimensionType type]
    (DimensionManager/registerDimension id type)))

(defn *create-provider-for
  "dim - `int`

  returns: `net.minecraft.world.WorldProvider`"
  (^net.minecraft.world.WorldProvider [^Integer dim]
    (DimensionManager/createProviderFor dim)))

(defn *get-static-dimension-i-ds
  "Not public API: used internally to get dimensions that should load at
   server startup

  returns: `java.lang.Integer[]`"
  ([]
    (DimensionManager/getStaticDimensionIDs )))

(defn *unregister-dimension
  "For unregistering a dimension when the save is changed (disconnected from a server or loaded a new save

  id - `int`"
  ([^Integer id]
    (DimensionManager/unregisterDimension id)))

