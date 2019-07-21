(ns net.minecraftforge.fml.client.config.GuiConfigEntries
  "This class implements the scrolling list functionality of the config GUI screens. It also provides all the default control handlers
  for the various property types."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries]))

(defn ->gui-config-entries
  "Constructor.

  parent - `net.minecraftforge.fml.client.config.GuiConfig`
  mc - `net.minecraft.client.Minecraft`"
  (^GuiConfigEntries [^net.minecraftforge.fml.client.config.GuiConfig parent ^net.minecraft.client.Minecraft mc]
    (new GuiConfigEntries parent mc)))

(defn owning-screen
  "Instance Constant.

  type: net.minecraftforge.fml.client.config.GuiConfig"
  (^net.minecraftforge.fml.client.config.GuiConfig [^GuiConfigEntries this]
    (-> this .-owningScreen)))

(defn mc
  "Instance Constant.

  type: net.minecraft.client.Minecraft"
  (^net.minecraft.client.Minecraft [^GuiConfigEntries this]
    (-> this .-mc)))

(defn list-entries
  "Instance Field.

  type: java.util.List<net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>"
  (^java.util.List [^GuiConfigEntries this]
    (-> this .-listEntries)))

(defn max-label-text-width
  "Instance Field.

  The max width of the label of all IConfigEntry objects.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-maxLabelTextWidth)))

(defn max-entry-right-bound
  "Instance Field.

  The max x boundary of all IConfigEntry objects.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-maxEntryRightBound)))

(defn label-x
  "Instance Field.

  The x position where the label should be drawn.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-labelX)))

(defn control-x
  "Instance Field.

  The x position where the control should be drawn.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-controlX)))

(defn control-width
  "Instance Field.

  The width of the control.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-controlWidth)))

(defn reset-x
  "Instance Field.

  The minimum x position where the Undo/Default buttons will start

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-resetX)))

(defn scroll-bar-x
  "Instance Field.

  The x position of the scroll bar.

  type: int"
  (^Integer [^GuiConfigEntries this]
    (-> this .-scrollBarX)))

(defn get-list-width
  "Gets the width of the list

  returns: `int`"
  (^Integer [^GuiConfigEntries this]
    (-> this (.getListWidth))))

(defn get-scroll-bar-x
  "returns: `int`"
  (^Integer [^GuiConfigEntries this]
    (-> this (.getScrollBarX))))

(defn key-typed
  "This method is a pass-through for IConfigEntry objects that require keystrokes. Called from the parent GuiConfig screen.

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn update-screen
  "This method is a pass-through for IConfigEntry objects that contain GuiTextField elements. Called from the parent GuiConfig
   screen."
  ([^GuiConfigEntries this]
    (-> this (.updateScreen))))

(defn on-gui-closed
  "This method is a pass-through for IConfigEntry objects that need to perform actions when the containing GUI is closed."
  ([^GuiConfigEntries this]
    (-> this (.onGuiClosed))))

(defn set-all-to-default
  "Sets all IConfigEntry objects on this screen to default. If includeChildren is true sub-category objects are set as
   well.

  include-children - `boolean`"
  ([^GuiConfigEntries this ^Boolean include-children]
    (-> this (.setAllToDefault include-children))))

(defn draw-screen-post
  "Calls the drawToolTip() method for all IConfigEntry objects on this screen. This is called from the parent GuiConfig screen
   after drawing all other elements.

  mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiConfigEntries this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreenPost mouse-x mouse-y partial-ticks))))

(defn get-list-entry
  "Gets the IGuiListEntry object for the given index

  index - `int`

  returns: `net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry`"
  (^net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry [^GuiConfigEntries this ^Integer index]
    (-> this (.getListEntry index))))

(defn save-config-elements
  "Saves all properties on this screen / child screens. This method returns true if any elements were changed that require
   a restart for proper handling.

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries this]
    (-> this (.saveConfigElements))))

(defn undo-all-changes
  "Reverts changes to all IConfigEntry objects on this screen. If includeChildren is true sub-category objects are
   reverted as well.

  include-children - `boolean`"
  ([^GuiConfigEntries this ^Boolean include-children]
    (-> this (.undoAllChanges include-children))))

(defn are-any-entries-enabled
  "Returns true if any IConfigEntry objects on this screen are enabled. If includeChildren is true sub-category objects
   are checked as well.

  include-children - `boolean`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries this ^Boolean include-children]
    (-> this (.areAnyEntriesEnabled include-children))))

(defn has-changed-entry?
  "Returns true if any IConfigEntry objects on this screen are changed. If includeChildren is true sub-category objects
   are checked as well.

  include-children - `boolean`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries this ^Boolean include-children]
    (-> this (.hasChangedEntry include-children))))

(defn are-all-entries-default
  "Returns true if all IConfigEntry objects on this screen are set to default. If includeChildren is true sub-category
   objects are checked as well.

  include-children - `boolean`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries this ^Boolean include-children]
    (-> this (.areAllEntriesDefault include-children))))

(defn get-size
  "returns: `int`"
  (^Integer [^GuiConfigEntries this]
    (-> this (.getSize))))

(defn mouse-clicked-pass-thru
  "This method is a pass-through for IConfigEntry objects that contain GuiTextField elements. Called from the parent GuiConfig
   screen.

  mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries this ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event]
    (-> this (.mouseClickedPassThru mouse-x mouse-y mouse-event))))

