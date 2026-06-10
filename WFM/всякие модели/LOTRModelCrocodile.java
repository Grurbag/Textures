package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * LOTRModelCrocodile - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class LOTRModelCrocodile extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer tail1;
    public ModelRenderer jaw;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer legBackLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer legFrontLeft;
    public ModelRenderer legFrontRight;
    public ModelRenderer spines;
    public ModelRenderer body;

    public LOTRModelCrocodile() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.legBackRight = new ModelRenderer(this, 2, 104);
        this.legBackRight.mirror = true;
        this.legBackRight.setRotationPoint(-6.0F, 15.0F, 15.0F);
        this.legBackRight.addBox(-16.0F, 0.0F, -3.0F, 16, 3, 6, 0.0F);
        this.setRotateAngle(legBackRight, 0.0F, 0.0F, -0.43633231520652765F);
        this.tail3 = new ModelRenderer(this, 0, 77);
        this.tail3.setRotationPoint(0.0F, 13.0F, 18.0F);
        this.tail3.addBox(-5.0F, 3.0F, 31.0F, 10, 3, 14, 0.0F);
        this.legBackLeft = new ModelRenderer(this, 2, 104);
        this.legBackLeft.setRotationPoint(6.0F, 15.0F, 15.0F);
        this.legBackLeft.addBox(0.0F, 0.0F, -3.0F, 16, 3, 6, 0.0F);
        this.setRotateAngle(legBackLeft, 0.0F, 0.0F, 0.43633231520652765F);
        this.spines = new ModelRenderer(this, 46, 45);
        this.spines.setRotationPoint(0.0F, 9.5F, -14.0F);
        this.spines.addBox(-5.0F, 0.0F, 0.0F, 10, 4, 32, 0.0F);
        this.setRotateAngle(spines, -0.03490658476948738F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 83);
        this.body.setRotationPoint(0.0F, 17.0F, -16.0F);
        this.body.addBox(-8.0F, -5.0F, 0.0F, 16, 9, 36, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 18.5F, -16.0F);
        this.head.addBox(-7.5F, -6.0F, -21.0F, 15, 6, 21, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 2, 104);
        this.legFrontLeft.setRotationPoint(6.0F, 15.0F, -11.0F);
        this.legFrontLeft.addBox(0.0F, 0.0F, -3.0F, 16, 3, 6, 0.0F);
        this.setRotateAngle(legFrontLeft, 0.0F, 0.0F, 0.43633231520652765F);
        this.legFrontRight = new ModelRenderer(this, 2, 104);
        this.legFrontRight.mirror = true;
        this.legFrontRight.setRotationPoint(-6.0F, 15.0F, -11.0F);
        this.legFrontRight.addBox(-16.0F, 0.0F, -3.0F, 16, 3, 6, 0.0F);
        this.setRotateAngle(legFrontRight, 0.0F, 0.0F, -0.43633231520652765F);
        this.jaw = new ModelRenderer(this, 58, 18);
        this.jaw.setRotationPoint(0.0F, 17.0F, -16.0F);
        this.jaw.addBox(-6.5F, 0.30000001192092896F, -19.0F, 13, 4, 19, 8.940696716308594E-8F);
        this.tail2 = new ModelRenderer(this, 0, 55);
        this.tail2.setRotationPoint(0.0F, 13.0F, 18.0F);
        this.tail2.addBox(-6.0F, 1.5F, 17.0F, 12, 5, 16, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 28);
        this.tail1.setRotationPoint(0.0F, 13.0F, 18.0F);
        this.tail1.addBox(-7.0F, 0.0F, 0.0F, 14, 7, 19, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.legBackRight.render(f5);
        this.tail3.render(f5);
        this.legBackLeft.render(f5);
        this.spines.render(f5);
        this.body.render(f5);
        this.head.render(f5);
        this.legFrontLeft.render(f5);
        this.legFrontRight.render(f5);
        this.jaw.render(f5);
        this.tail2.render(f5);
        this.tail1.render(f5);
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
