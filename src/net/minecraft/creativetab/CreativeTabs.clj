(ns net.minecraft.creativetab.CreativeTabs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.creativetab CreativeTabs]))

(defn ->creative-tabs
  "Constructor.

  index - `int`
  label - `java.lang.String`"
  (^CreativeTabs [^Integer index ^java.lang.String label]
    (new CreativeTabs index label))
  (^CreativeTabs [^java.lang.String label]
    (new CreativeTabs label)))

(defn *-creative-tab-array
  "Static Field.

  type: net.minecraft.creativetab.CreativeTabs[]"
  []
  CreativeTabs/CREATIVE_TAB_ARRAY)

(def *-building-blocks
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/BUILDING_BLOCKS)

(def *-decorations
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/DECORATIONS)

(def *-redstone
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/REDSTONE)

(def *-transportation
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/TRANSPORTATION)

(def *-misc
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/MISC)

(def *-search
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/SEARCH)

(def *-food
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/FOOD)

(def *-tools
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/TOOLS)

(def *-combat
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/COMBAT)

(def *-brewing
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/BREWING)

(def *-materials
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/MATERIALS)

(def *-inventory
  "Static Constant.

  type: net.minecraft.creativetab.CreativeTabs"
  CreativeTabs/INVENTORY)

(defn *get-next-id
  "returns: `int`"
  (^Integer []
    (CreativeTabs/getNextID )))

(defn add-enchantment-books-to-list
  "item-list - `java.util.List`
  enchantment-type - `net.minecraft.enchantment.EnumEnchantmentType`"
  ([^CreativeTabs this ^java.util.List item-list ^net.minecraft.enchantment.EnumEnchantmentType enchantment-type]
    (-> this (.addEnchantmentBooksToList item-list enchantment-type))))

(defn display-all-relevant-items
  "p-78018-1 - `net.minecraft.util.NonNullList`"
  ([^CreativeTabs this ^net.minecraft.util.NonNullList p-78018-1]
    (-> this (.displayAllRelevantItems p-78018-1))))

(defn draw-in-foreground-of-tab
  "returns: `boolean`"
  (^Boolean [^CreativeTabs this]
    (-> this (.drawInForegroundOfTab))))

(defn set-relevant-enchantment-types
  "types - `net.minecraft.enchantment.EnumEnchantmentType`

  returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^CreativeTabs this ^net.minecraft.enchantment.EnumEnchantmentType types]
    (-> this (.setRelevantEnchantmentTypes types))))

(defn get-searchbar-width
  "Gets the width of the search bar of the creative tab, use this if your
   creative tab name overflows together with a custom texture.

  returns: The width of the search bar, 89 by default - `int`"
  (^Integer [^CreativeTabs this]
    (-> this (.getSearchbarWidth))))

(defn tab-in-first-row?
  "returns: `boolean`"
  (^Boolean [^CreativeTabs this]
    (-> this (.isTabInFirstRow))))

(defn get-tab-page
  "returns: `int`"
  (^Integer [^CreativeTabs this]
    (-> this (.getTabPage))))

(defn get-tab-label
  "returns: `java.lang.String`"
  (^java.lang.String [^CreativeTabs this]
    (-> this (.getTabLabel))))

(defn get-translated-tab-label
  "returns: `java.lang.String`"
  (^java.lang.String [^CreativeTabs this]
    (-> this (.getTranslatedTabLabel))))

(defn get-relevant-enchantment-types
  "returns: `net.minecraft.enchantment.EnumEnchantmentType[]`"
  ([^CreativeTabs this]
    (-> this (.getRelevantEnchantmentTypes))))

(defn get-tab-index
  "returns: `int`"
  (^Integer [^CreativeTabs this]
    (-> this (.getTabIndex))))

(defn should-hide-player-inventory?
  "returns: `boolean`"
  (^Boolean [^CreativeTabs this]
    (-> this (.shouldHidePlayerInventory))))

(defn get-background-image-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CreativeTabs this]
    (-> this (.getBackgroundImageName))))

(defn get-tab-icon-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^CreativeTabs this]
    (-> this (.getTabIconItem))))

(defn has-search-bar?
  "Determines if the search bar should be shown for this tab.

  returns: True to show the bar - `boolean`"
  (^Boolean [^CreativeTabs this]
    (-> this (.hasSearchBar))))

(defn get-tab-column
  "returns: `int`"
  (^Integer [^CreativeTabs this]
    (-> this (.getTabColumn))))

(defn get-icon-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^CreativeTabs this]
    (-> this (.getIconItemStack))))

(defn has-relevant-enchantment-type?
  "enchantment-type - `net.minecraft.enchantment.EnumEnchantmentType`

  returns: `boolean`"
  (^Boolean [^CreativeTabs this ^net.minecraft.enchantment.EnumEnchantmentType enchantment-type]
    (-> this (.hasRelevantEnchantmentType enchantment-type))))

(defn set-background-image-name
  "texture - `java.lang.String`

  returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^CreativeTabs this ^java.lang.String texture]
    (-> this (.setBackgroundImageName texture))))

(defn set-no-title
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^CreativeTabs this]
    (-> this (.setNoTitle))))

(defn set-no-scrollbar
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^CreativeTabs this]
    (-> this (.setNoScrollbar))))

