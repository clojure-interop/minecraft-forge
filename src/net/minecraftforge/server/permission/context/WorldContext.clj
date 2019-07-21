(ns net.minecraftforge.server.permission.context.WorldContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context WorldContext]))

(defn ->world-context
  "Constructor.

  w - `net.minecraft.world.World`"
  (^WorldContext [^net.minecraft.world.World w]
    (new WorldContext w)))

(defn get-world
  "Description copied from interface: IContext

  returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^WorldContext this]
    (-> this (.getWorld))))

(defn get-player
  "returns: Player requesting permission. Can be null - `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^WorldContext this]
    (-> this (.getPlayer))))

