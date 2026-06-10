// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cape1;
	private final ModelRenderer cape2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		cape1 = new ModelRenderer(this);
		cape1.setRotationPoint(-4.0F, 11.5298F, 5.0712F);
		body.addChild(cape1);
		setRotationAngle(cape1, -0.2618F, 3.1416F, 0.0F);
		cape1.cubeList.add(new ModelBox(cape1, 0, 8, -4.0F, -12.0F, 0.0F, 8, 24, 0, 0.0F, false));

		cape2 = new ModelRenderer(this);
		cape2.setRotationPoint(4.0F, 11.5298F, 5.0712F);
		body.addChild(cape2);
		setRotationAngle(cape2, 0.2618F, 0.0F, 0.0F);
		cape2.cubeList.add(new ModelBox(cape2, 0, 8, -4.0F, -12.0F, 0.0F, 8, 24, 0, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_right.addChild(hand_right2);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 42, 0, -4.0F, -3.0F, -3.0F, 5, 6, 6, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 42, 0, -1.0F, -3.0F, -3.0F, 5, 6, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}