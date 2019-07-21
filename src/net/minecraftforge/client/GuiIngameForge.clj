(ns net.minecraftforge.client.GuiIngameForge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client GuiIngameForge]))

(defn ->gui-ingame-forge
  "Constructor.

  mc - `net.minecraft.client.Minecraft`"
  (^GuiIngameForge [^net.minecraft.client.Minecraft mc]
    (new GuiIngameForge mc)))

(defn *-render-helmet
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderHelmet)

(defn *-render-portal
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderPortal)

(defn *-render-hotbar
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderHotbar)

(defn *-render-crosshairs
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderCrosshairs)

(defn *-render-boss-health
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderBossHealth)

(defn *-render-health
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderHealth)

(defn *-render-armor
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderArmor)

(defn *-render-food
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderFood)

(defn *-render-health-mount
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderHealthMount)

(defn *-render-air
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderAir)

(defn *-render-experiance
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderExperiance)

(defn *-render-jump-bar
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderJumpBar)

(defn *-render-objective
  "Static Field.

  type: boolean"
  []
  GuiIngameForge/renderObjective)

(defn *-left-height
  "Static Field.

  type: int"
  []
  GuiIngameForge/left_height)

(defn *-right-height
  "Static Field.

  type: int"
  []
  GuiIngameForge/right_height)

(defn render-game-overlay
  "partial-ticks - `float`"
  ([^GuiIngameForge this ^Float partial-ticks]
    (-> this (.renderGameOverlay partial-ticks))))

(defn get-resolution
  "returns: `net.minecraft.client.gui.ScaledResolution`"
  (^net.minecraft.client.gui.ScaledResolution [^GuiIngameForge this]
    (-> this (.getResolution))))

(defn render-health
  "width - `int`
  height - `int`"
  ([^GuiIngameForge this ^Integer width ^Integer height]
    (-> this (.renderHealth width height))))

(defn render-food
  "width - `int`
  height - `int`"
  ([^GuiIngameForge this ^Integer width ^Integer height]
    (-> this (.renderFood width height))))

