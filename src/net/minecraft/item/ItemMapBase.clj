(ns net.minecraft.item.ItemMapBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemMapBase]))

(defn ->item-map-base
  "Constructor."
  (^ItemMapBase []
    (new ItemMapBase )))

(defn map?
  "returns: `boolean`"
  (^Boolean [^ItemMapBase this]
    (-> this (.isMap))))

(defn create-map-data-packet
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^ItemMapBase this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.createMapDataPacket stack world-in player))))

