package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class OBJECT_(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("object", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var data : String
        get()  = attributeString29bd7c40.get(this, "data")
        set(newValue) {attributeString29bd7c40.set(this, "data", newValue)}

    var type : String
        get()  = attributeString29bd7c40.get(this, "type")
        set(newValue) {attributeString29bd7c40.set(this, "type", newValue)}

    var height : String
        get()  = attributeString29bd7c40.get(this, "height")
        set(newValue) {attributeString29bd7c40.set(this, "height", newValue)}

    var width : String
        get()  = attributeString29bd7c40.get(this, "width")
        set(newValue) {attributeString29bd7c40.set(this, "width", newValue)}

    var usemap : String
        get()  = attributeString29bd7c40.get(this, "usemap")
        set(newValue) {attributeString29bd7c40.set(this, "usemap", newValue)}

    var name : String
        get()  = attributeString400e96f6.get(this, "name")
        set(newValue) {attributeString400e96f6.set(this, "name", newValue)}

    var form : String
        get()  = attributeString29bd7c40.get(this, "form")
        set(newValue) {attributeString29bd7c40.set(this, "form", newValue)}

    var classId : String
        get()  = attributeString29bd7c40.get(this, "classid")
        set(newValue) {attributeString29bd7c40.set(this, "classid", newValue)}


}

public class OL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ol", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var start : String
        get()  = attributeString29bd7c40.get(this, "start")
        set(newValue) {attributeString29bd7c40.set(this, "start", newValue)}

    var reversed : Boolean
        get()  = attributeBooleanffbab22b.get(this, "reversed")
        set(newValue) {attributeBooleanffbab22b.set(this, "reversed", newValue)}


}

public class OPTGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("optgroup", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var disabled : Boolean
        get()  = attributeBooleanffbab22b.get(this, "disabled")
        set(newValue) {attributeBooleanffbab22b.set(this, "disabled", newValue)}

    var label : String
        get()  = attributeString29bd7c40.get(this, "label")
        set(newValue) {attributeString29bd7c40.set(this, "label", newValue)}


}

public class OPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("option", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var disabled : Boolean
        get()  = attributeBooleanffbab22b.get(this, "disabled")
        set(newValue) {attributeBooleanffbab22b.set(this, "disabled", newValue)}

    var selected : Boolean
        get()  = attributeBooleanffbab22b.get(this, "selected")
        set(newValue) {attributeBooleanffbab22b.set(this, "selected", newValue)}

    var label : String
        get()  = attributeString29bd7c40.get(this, "label")
        set(newValue) {attributeString29bd7c40.set(this, "label", newValue)}

    var value : String
        get()  = attributeString29bd7c40.get(this, "value")
        set(newValue) {attributeString29bd7c40.set(this, "value", newValue)}


}

public class OUTPUT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("output", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var for_ : String
        get()  = attributeString29bd7c40.get(this, "for")
        set(newValue) {attributeString29bd7c40.set(this, "for", newValue)}

    var form : String
        get()  = attributeString29bd7c40.get(this, "form")
        set(newValue) {attributeString29bd7c40.set(this, "form", newValue)}

    var name : String
        get()  = attributeString29bd7c40.get(this, "name")
        set(newValue) {attributeString29bd7c40.set(this, "name", newValue)}


}
