(ns net.minecraft.client.player.inventory.ContainerLocalMenu
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.player.inventory ContainerLocalMenu]))

(defn ->container-local-menu
  "Constructor.

  id - `java.lang.String`
  title - `net.minecraft.util.text.ITextComponent`
  slot-count - `int`"
  (^ContainerLocalMenu [^java.lang.String id ^net.minecraft.util.text.ITextComponent title ^Integer slot-count]
    (new ContainerLocalMenu id title slot-count)))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^ContainerLocalMenu this ^Integer id]
    (-> this (.getField id))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^ContainerLocalMenu this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^ContainerLocalMenu this]
    (-> this (.getFieldCount))))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^ContainerLocalMenu this]
    (-> this (.isLocked))))

(defn set-lock-code
  "code - `net.minecraft.world.LockCode`"
  ([^ContainerLocalMenu this ^net.minecraft.world.LockCode code]
    (-> this (.setLockCode code))))

(defn get-lock-code
  "returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^ContainerLocalMenu this]
    (-> this (.getLockCode))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^ContainerLocalMenu this]
    (-> this (.getGuiID))))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^ContainerLocalMenu this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

