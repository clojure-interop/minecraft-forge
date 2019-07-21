(ns net.minecraft.world.storage.MapData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage MapData]))

(defn ->map-data
  "Constructor.

  mapname - `java.lang.String`"
  (^MapData [^java.lang.String mapname]
    (new MapData mapname)))

(defn x-center
  "Instance Field.

  type: int"
  (^Integer [^MapData this]
    (-> this .-xCenter)))

(defn z-center
  "Instance Field.

  type: int"
  (^Integer [^MapData this]
    (-> this .-zCenter)))

(defn dimension
  "Instance Field.

  type: int"
  (^Integer [^MapData this]
    (-> this .-dimension)))

(defn tracking-position
  "Instance Field.

  type: boolean"
  (^Boolean [^MapData this]
    (-> this .-trackingPosition)))

(defn unlimited-tracking
  "Instance Field.

  type: boolean"
  (^Boolean [^MapData this]
    (-> this .-unlimitedTracking)))

(defn scale
  "Instance Field.

  type: byte"
  (^Byte [^MapData this]
    (-> this .-scale)))

(defn colors
  "Instance Field.

  type: byte[]"
  ([^MapData this]
    (-> this .-colors)))

(defn players-array-list
  "Instance Field.

  type: java.util.List<net.minecraft.world.storage.MapData$MapInfo>"
  (^java.util.List [^MapData this]
    (-> this .-playersArrayList)))

(defn map-decorations
  "Instance Field.

  type: java.util.Map<java.lang.String,net.minecraft.world.storage.MapDecoration>"
  (^java.util.Map [^MapData this]
    (-> this .-mapDecorations)))

(defn *add-target-decoration
  "p-191094-0 - `net.minecraft.item.ItemStack`
  p-191094-1 - `net.minecraft.util.math.BlockPos`
  p-191094-2 - `java.lang.String`
  p-191094-3 - `net.minecraft.world.storage.MapDecoration$Type`"
  ([^net.minecraft.item.ItemStack p-191094-0 ^net.minecraft.util.math.BlockPos p-191094-1 ^java.lang.String p-191094-2 ^net.minecraft.world.storage.MapDecoration$Type p-191094-3]
    (MapData/addTargetDecoration p-191094-0 p-191094-1 p-191094-2 p-191094-3)))

(defn calculate-map-center
  "x - `double`
  z - `double`
  map-scale - `int`"
  ([^MapData this ^Double x ^Double z ^Integer map-scale]
    (-> this (.calculateMapCenter x z map-scale))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^MapData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MapData this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn update-visible-players
  "player - `net.minecraft.entity.player.EntityPlayer`
  map-stack - `net.minecraft.item.ItemStack`"
  ([^MapData this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack map-stack]
    (-> this (.updateVisiblePlayers player map-stack))))

(defn get-map-packet
  "map-stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^MapData this ^net.minecraft.item.ItemStack map-stack ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getMapPacket map-stack world-in player))))

(defn update-map-data
  "x - `int`
  y - `int`"
  ([^MapData this ^Integer x ^Integer y]
    (-> this (.updateMapData x y))))

(defn get-map-info
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.world.storage.MapData$MapInfo`"
  (^net.minecraft.world.storage.MapData$MapInfo [^MapData this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getMapInfo player))))

