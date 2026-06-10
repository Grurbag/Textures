package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelCentigor - Undefined
 * Created using Tabula 4.1.1
 */
public class WFMModelCentigor extends ModelBase {
    public ModelRenderer body_bottom;
    public ModelRenderer leg_right_back;
    public ModelRenderer leg_left_back;
    public ModelRenderer leg_left_front;
    public ModelRenderer leg_right_front;
    public ModelRenderer tail;
    public ModelRenderer body;
    public ModelRenderer hand_left;
    public ModelRenderer hand_right;
    public ModelRenderer head;
    public ModelRenderer leg_right_back_1;
    public ModelRenderer leg_left_back_2;
    public ModelRenderer leg_left_back_1;
    public ModelRenderer leg_left_back_2_1;
    public ModelRenderer leg_left_front_1;
    public ModelRenderer leg_left_front_2;
    public ModelRenderer leg_right_front_1;
    public ModelRenderer leg_right_front_2;
    public ModelRenderer tail_1;
    public ModelRenderer tail_2;
    public ModelRenderer mouth;
    public ModelRenderer horn_right;
    public ModelRenderer horn_left;
    public ModelRenderer horn_right_1;
    public ModelRenderer horn_right_2;
    public ModelRenderer horn_left_3;
    public ModelRenderer horn_left_1;
    public ModelRenderer horn_left_2;
    public ModelRenderer horn_left_3_1;

    public WFMModelCentigor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.leg_left_back_1 = new ModelRenderer(this, 78, 43);
        this.leg_left_back_1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leg_left_back_1.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.leg_right_front = new ModelRenderer(this, 60, 29);
        this.leg_right_front.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.leg_right_front.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.horn_right_1 = new ModelRenderer(this, 54, 21);
        this.horn_right_1.setRotationPoint(-6.0F, 2.0F, 10.8F);
        this.horn_right_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(horn_right_1, -2.6406831582674206F, 0.8651597102135892F, 0.5918411493512771F);
        this.leg_left_back_2_1 = new ModelRenderer(this, 78, 51);
        this.leg_left_back_2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_left_back_2_1.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.tail_2 = new ModelRenderer(this, 51, 0);
        this.tail_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail_2.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tail_2, -0.2617993877991494F, 0.0F, 0.0F);
        this.horn_left_2 = new ModelRenderer(this, 66, 21);
        this.horn_left_2.setRotationPoint(2.9F, -1.5F, 12.2F);
        this.horn_left_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(horn_left_2, -1.8212510744560826F, 0.0F, -0.5918411493512771F);
        this.horn_left = new ModelRenderer(this, 40, 20);
        this.horn_left.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn_left.addBox(2.4F, -6.3F, 4.9F, 2, 2, 5, 0.0F);
        this.setRotateAngle(horn_left, 0.9105382707654417F, 0.36425021489121656F, 0.0F);
        this.leg_left_front = new ModelRenderer(this, 44, 29);
        this.leg_left_front.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.leg_left_front.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.leg_left_front_2 = new ModelRenderer(this, 44, 51);
        this.leg_left_front_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_left_front_2.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.mouth = new ModelRenderer(this, 25, 0);
        this.mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mouth.addBox(-1.8F, -4.0F, -7.0F, 4, 4, 4, 0.0F);
        this.hand_left = new ModelRenderer(this, 0, 16);
        this.hand_left.mirror = true;
        this.hand_left.setRotationPoint(5.0F, -6.0F, -8.5F);
        this.hand_left.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -8.0F, -8.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(head, 0.08726646259971647F, 0.0F, 0.0F);
        this.body_bottom = new ModelRenderer(this, 0, 34);
        this.body_bottom.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body_bottom.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.leg_right_front_1 = new ModelRenderer(this, 60, 41);
        this.leg_right_front_1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leg_right_front_1.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.hand_right = new ModelRenderer(this, 0, 16);
        this.hand_right.setRotationPoint(-5.0F, -6.0F, -8.5F);
        this.hand_right.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.horn_left_3 = new ModelRenderer(this, 78, 21);
        this.horn_left_3.setRotationPoint(-3.7F, -2.1F, 12.4F);
        this.horn_left_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(horn_left_3, -1.8212510744560826F, 0.0F, 0.5918411493512771F);
        this.horn_right_2 = new ModelRenderer(this, 66, 21);
        this.horn_right_2.setRotationPoint(-3.9F, -6.2F, 9.9F);
        this.horn_right_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(horn_right_2, -1.0471975511965976F, 0.0F, 0.0F);
        this.horn_left_1 = new ModelRenderer(this, 54, 21);
        this.horn_left_1.setRotationPoint(5.5F, 2.4F, 10.0F);
        this.horn_left_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(horn_left_1, -2.6406831582674206F, -0.8651597102135892F, -0.5918411493512771F);
        this.leg_right_front_2 = new ModelRenderer(this, 60, 51);
        this.leg_right_front_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_right_front_2.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.tail = new ModelRenderer(this, 44, 0);
        this.tail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail, -1.1344640137963142F, 0.0F, 0.0F);
        this.horn_left_3_1 = new ModelRenderer(this, 78, 21);
        this.horn_left_3_1.setRotationPoint(2.9F, -6.2F, 9.8F);
        this.horn_left_3_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(horn_left_3_1, -1.0471975511965976F, 0.0F, 0.0F);
        this.leg_right_back_1 = new ModelRenderer(this, 96, 43);
        this.leg_right_back_1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leg_right_back_1.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.tail_1 = new ModelRenderer(this, 38, 5);
        this.tail_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail_1.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, -8.0F, -8.5F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leg_right_back = new ModelRenderer(this, 96, 29);
        this.leg_right_back.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.leg_right_back.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.horn_right = new ModelRenderer(this, 40, 20);
        this.horn_right.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn_right.addBox(-4.4F, -6.5F, 4.7F, 2, 2, 5, 0.0F);
        this.setRotateAngle(horn_right, 0.9075712110370513F, -0.3490658503988659F, 0.0F);
        this.leg_left_front_1 = new ModelRenderer(this, 44, 41);
        this.leg_left_front_1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leg_left_front_1.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.leg_left_back_2 = new ModelRenderer(this, 96, 51);
        this.leg_left_back_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_left_back_2.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.leg_left_back = new ModelRenderer(this, 78, 29);
        this.leg_left_back.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.leg_left_back.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.leg_left_back.addChild(this.leg_left_back_1);
        this.horn_right.addChild(this.horn_right_1);
        this.leg_left_back_1.addChild(this.leg_left_back_2_1);
        this.tail.addChild(this.tail_2);
        this.horn_left.addChild(this.horn_left_2);
        this.head.addChild(this.horn_left);
        this.leg_left_front_1.addChild(this.leg_left_front_2);
        this.head.addChild(this.mouth);
        this.leg_right_front.addChild(this.leg_right_front_1);
        this.horn_right.addChild(this.horn_left_3);
        this.horn_right.addChild(this.horn_right_2);
        this.horn_left.addChild(this.horn_left_1);
        this.leg_right_front_1.addChild(this.leg_right_front_2);
        this.horn_left.addChild(this.horn_left_3_1);
        this.leg_right_back.addChild(this.leg_right_back_1);
        this.tail.addChild(this.tail_1);
        this.head.addChild(this.horn_right);
        this.leg_left_front.addChild(this.leg_left_front_1);
        this.leg_right_back_1.addChild(this.leg_left_back_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.leg_right_front.render(f5);
        this.leg_left_front.render(f5);
        this.hand_left.render(f5);
        this.head.render(f5);
        this.body_bottom.render(f5);
        this.hand_right.render(f5);
        this.tail.render(f5);
        this.body.render(f5);
        this.leg_right_back.render(f5);
        this.leg_left_back.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
