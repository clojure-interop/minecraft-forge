(ns net.minecraft.client.gui.GuiEnchantment
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiEnchantment]))

(defn ->gui-enchantment
  "Constructor.

  inventory - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`
  nameable - `net.minecraft.world.IWorldNameable`"
  (^GuiEnchantment [^net.minecraft.entity.player.InventoryPlayer inventory ^net.minecraft.world.World world-in ^net.minecraft.world.IWorldNameable nameable]
    (new GuiEnchantment inventory world-in nameable)))

(defn ticks
  "Instance Field.

  type: int"
  (^Integer [^GuiEnchantment this]
    (-> this .-ticks)))

(defn flip
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-flip)))

(defn o-flip
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-oFlip)))

(defn flip-t
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-flipT)))

(defn flip-a
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-flipA)))

(defn open
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-open)))

(defn o-open
  "Instance Field.

  type: float"
  (^Float [^GuiEnchantment this]
    (-> this .-oOpen)))

(defn update-screen
  ""
  ([^GuiEnchantment this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiEnchantment this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn tick-book
  ""
  ([^GuiEnchantment this]
    (-> this (.tickBook))))

