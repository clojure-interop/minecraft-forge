(ns net.minecraft.client.gui.GuiNewChat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiNewChat]))

(defn ->gui-new-chat
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^GuiNewChat [^net.minecraft.client.Minecraft mc-in]
    (new GuiNewChat mc-in)))

(defn *calculate-chatbox-width
  "scale - `float`

  returns: `int`"
  (^Integer [^Float scale]
    (GuiNewChat/calculateChatboxWidth scale)))

(defn *calculate-chatbox-height
  "scale - `float`

  returns: `int`"
  (^Integer [^Float scale]
    (GuiNewChat/calculateChatboxHeight scale)))

(defn refresh-chat
  ""
  ([^GuiNewChat this]
    (-> this (.refreshChat))))

(defn draw-chat
  "update-counter - `int`"
  ([^GuiNewChat this ^Integer update-counter]
    (-> this (.drawChat update-counter))))

(defn print-chat-message-with-optional-deletion
  "chat-component - `net.minecraft.util.text.ITextComponent`
  chat-line-id - `int`"
  ([^GuiNewChat this ^net.minecraft.util.text.ITextComponent chat-component ^Integer chat-line-id]
    (-> this (.printChatMessageWithOptionalDeletion chat-component chat-line-id))))

(defn scroll
  "amount - `int`"
  ([^GuiNewChat this ^Integer amount]
    (-> this (.scroll amount))))

(defn reset-scroll
  ""
  ([^GuiNewChat this]
    (-> this (.resetScroll))))

(defn get-line-count
  "returns: `int`"
  (^Integer [^GuiNewChat this]
    (-> this (.getLineCount))))

(defn get-chat-open?
  "returns: `boolean`"
  (^Boolean [^GuiNewChat this]
    (-> this (.getChatOpen))))

(defn get-sent-messages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GuiNewChat this]
    (-> this (.getSentMessages))))

(defn get-chat-component
  "mouse-x - `int`
  mouse-y - `int`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^GuiNewChat this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.getChatComponent mouse-x mouse-y))))

(defn get-chat-height
  "returns: `int`"
  (^Integer [^GuiNewChat this]
    (-> this (.getChatHeight))))

(defn add-to-sent-messages
  "message - `java.lang.String`"
  ([^GuiNewChat this ^java.lang.String message]
    (-> this (.addToSentMessages message))))

(defn delete-chat-line
  "id - `int`"
  ([^GuiNewChat this ^Integer id]
    (-> this (.deleteChatLine id))))

(defn clear-chat-messages
  "p-146231-1 - `boolean`"
  ([^GuiNewChat this ^Boolean p-146231-1]
    (-> this (.clearChatMessages p-146231-1))))

(defn get-chat-scale
  "returns: `float`"
  (^Float [^GuiNewChat this]
    (-> this (.getChatScale))))

(defn print-chat-message
  "chat-component - `net.minecraft.util.text.ITextComponent`"
  ([^GuiNewChat this ^net.minecraft.util.text.ITextComponent chat-component]
    (-> this (.printChatMessage chat-component))))

(defn get-chat-width
  "returns: `int`"
  (^Integer [^GuiNewChat this]
    (-> this (.getChatWidth))))

