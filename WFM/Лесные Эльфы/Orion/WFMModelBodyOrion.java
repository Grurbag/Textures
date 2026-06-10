// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBodyOrion extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer pants;
	private final ModelRenderer hand_left;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer shoulder_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer shoulder_right;
	private final ModelRenderer shoulder_right2;

	public WFMModelBodyOrion() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 3.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -8.5F, -2.0F, 0.0F, 16, 25, 0, 0.0F, false));

		pants = new ModelRenderer(this);
		pants.setRotationPoint(0.0F, 14.0F, -2.0F);
		bipedBody.addChild(pants);
		pants.cubeList.add(new ModelBox(pants, 0, 53, -4.0F, -2.0F, -1.0F, 8, 11, 0, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(8.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 16, -3.0F, -2.0F, -2.1F, 4, 12, 4, 0.5F, true));

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		hand_left.addChild(shoulder_left);
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 0, 32, -4.0F, -2.0F, -3.0F, 6, 3, 6, 0.0F, false));

		shoulder_left2 = new ModelRenderer(this);
		shoulder_left2.setRotationPoint(0.0F, -3.0F, 0.0F);
		shoulder_left.addChild(shoulder_left2);
		shoulder_left2.cubeList.add(new ModelBox(shoulder_left2, 0, 43, -4.0F, -2.0F, -3.0F, 6, 3, 6, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 16, 16, -3.0F, -2.0F, -2.1F, 4, 12, 4, 0.5F, false));

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		hand_right.addChild(shoulder_right);
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 0, 32, -4.0F, -2.0F, -3.0F, 6, 3, 6, 0.0F, false));

		shoulder_right2 = new ModelRenderer(this);
		shoulder_right2.setRotationPoint(0.0F, -3.0F, 0.0F);
		shoulder_right.addChild(shoulder_right2);
		shoulder_right2.cubeList.add(new ModelBox(shoulder_right2, 0, 43, -4.0F, -2.0F, -3.0F, 6, 3, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}