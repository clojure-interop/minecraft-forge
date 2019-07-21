(ns net.minecraft.item.ItemMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemMap]))

(defn *setup-new-map
  "p-190906-0 - `net.minecraft.world.World`
  p-190906-1 - `double`
  p-190906-3 - `double`
  p-190906-5 - `byte`
  p-190906-6 - `boolean`
  p-190906-7 - `boolean`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.world.World p-190906-0 ^Double p-190906-1 ^Double p-190906-3 ^Byte p-190906-5 ^Boolean p-190906-6 ^Boolean p-190906-7]
    (ItemMap/setupNewMap p-190906-0 p-190906-1 p-190906-3 p-190906-5 p-190906-6 p-190906-7)))

(defn *load-map-data
  "map-id - `int`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.world.storage.MapData`"
  (^net.minecraft.world.storage.MapData [^Integer map-id ^net.minecraft.world.World world-in]
    (ItemMap/loadMapData map-id world-in)))

(defn *render-biome-preview-map
  "p-190905-0 - `net.minecraft.world.World`
  p-190905-1 - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.world.World p-190905-0 ^net.minecraft.item.ItemStack p-190905-1]
    (ItemMap/renderBiomePreviewMap p-190905-0 p-190905-1)))

(defn *get-color
  "p-190907-0 - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack p-190907-0]
    (ItemMap/getColor p-190907-0)))

(defn get-map-data
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.world.storage.MapData`"
  (^net.minecraft.world.storage.MapData [^ItemMap this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in]
    (-> this (.getMapData stack world-in))))

(defn update-map-data
  "world-in - `net.minecraft.world.World`
  viewer - `net.minecraft.entity.Entity`
  data - `net.minecraft.world.storage.MapData`"
  ([^ItemMap this ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity viewer ^net.minecraft.world.storage.MapData data]
    (-> this (.updateMapData world-in viewer data))))

(defn on-update
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`
  item-slot - `int`
  is-selected - `boolean`"
  ([^ItemMap this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Integer item-slot ^Boolean is-selected]
    (-> this (.onUpdate stack world-in entity-in item-slot is-selected))))

(defn create-map-data-packet
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^ItemMap this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.createMapDataPacket stack world-in player))))

(defn on-created
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ItemMap this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onCreated stack world-in player-in))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemMap this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

