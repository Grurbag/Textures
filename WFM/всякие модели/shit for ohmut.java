// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_left;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(-3.0F, 2.0F, 5.5F);
		body.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, -0.5236F, 0.0F);
		wing_right.cubeList.add(new ModelBox(wing_right, 42, -11, -2.0F, -9.0F, -5.5F, 0, 20, 15, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(4.0F, 2.0F, 5.5F);
		body.addChild(wing_left);
		setRotationAngle(wing_left, 0.0F, 0.5236F, 0.0F);
		wing_left.cubeList.add(new ModelBox(wing_left, 42, -11, 0.0F, -9.0F, -5.5F, 0, 20, 15, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}