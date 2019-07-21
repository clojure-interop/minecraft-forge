(ns net.minecraft.tileentity.TileEntityEnderChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityEnderChest]))

(defn ->tile-entity-ender-chest
  "Constructor."
  (^TileEntityEnderChest []
    (new TileEntityEnderChest )))

(defn lid-angle
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnderChest this]
    (-> this .-lidAngle)))

(defn prev-lid-angle
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnderChest this]
    (-> this .-prevLidAngle)))

(defn num-players-using
  "Instance Field.

  type: int"
  (^Integer [^TileEntityEnderChest this]
    (-> this .-numPlayersUsing)))

(defn update
  ""
  ([^TileEntityEnderChest this]
    (-> this (.update))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityEnderChest this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn invalidate
  ""
  ([^TileEntityEnderChest this]
    (-> this (.invalidate))))

(defn open-chest
  ""
  ([^TileEntityEnderChest this]
    (-> this (.openChest))))

(defn close-chest
  ""
  ([^TileEntityEnderChest this]
    (-> this (.closeChest))))

(defn can-be-used?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityEnderChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeUsed player))))

