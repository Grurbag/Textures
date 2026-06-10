// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer overlay;
	private final ModelRenderer podborodok;
	private final ModelRenderer podborodok2;
	private final ModelRenderer podborodok3;
	private final ModelRenderer snake;
	private final ModelRenderer snake2;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		podborodok = new ModelRenderer(this);
		podborodok.setRotationPoint(0.0F, 1.0F, -4.5F);
		head.addChild(podborodok);
		setRotationAngle(podborodok, 0.7854F, 0.0F, 0.0F);
		podborodok.cubeList.add(new ModelBox(podborodok, 0, 27, -1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));

		podborodok2 = new ModelRenderer(this);
		podborodok2.setRotationPoint(0.0F, 0.0F, -1.0F);
		podborodok.addChild(podborodok2);
		setRotationAngle(podborodok2, -0.3491F, 0.0F, 0.0F);
		podborodok2.cubeList.add(new ModelBox(podborodok2, 12, 28, -1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F, false));

		podborodok3 = new ModelRenderer(this);
		podborodok3.setRotationPoint(1.0F, 0.0F, -1.0F);
		podborodok2.addChild(podborodok3);
		setRotationAngle(podborodok3, -0.3491F, 0.0F, 0.0F);
		podborodok3.cubeList.add(new ModelBox(podborodok3, 23, 29, -1.5F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));

		snake = new ModelRenderer(this);
		snake.setRotationPoint(1.0F, -9.0F, -4.0F);
		head.addChild(snake);
		setRotationAngle(snake, 0.2618F, 0.0F, 0.0F);
		snake.cubeList.add(new ModelBox(snake, 54, 24, -3.5F, -4.0F, 0.0F, 5, 8, 0, 0.0F, false));

		snake2 = new ModelRenderer(this);
		snake2.setRotationPoint(0.0F, -4.0F, 0.0F);
		snake.addChild(snake2);
		setRotationAngle(snake2, 0.48F, 0.0F, 0.0F);
		snake2.cubeList.add(new ModelBox(snake2, 41, 28, -3.5F, -4.0F, 0.0F, 5, 4, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}