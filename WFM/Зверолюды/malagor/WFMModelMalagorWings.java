// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_left_r1;
	private final ModelRenderer wing_right;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 40, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(-1.0F, 6.0F, 1.0F);
		body.addChild(wing_left);
		

		wing_left_r1 = new ModelRenderer(this);
		wing_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wing_left.addChild(wing_left_r1);
		setRotationAngle(wing_left_r1, 0.0F, 0.1745F, 0.0F);
		wing_left_r1.cubeList.add(new ModelBox(wing_left_r1, 0, 0, -19.0F, -16.0F, 1.0F, 20, 20, 0, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(1.0F, 6.0F, 3.0F);
		body.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, 2.9671F, 0.0F);
		wing_right.cubeList.add(new ModelBox(wing_right, 0, 0, -19.0F, -16.0F, 1.0F, 20, 20, 0, 0.0F, false));
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